package me.moneld;

public class App {

    public int Compute(String type, String name, String beverage, String size, String dessert, String dsize, String coffee) {
        int total = 0;

        if (type == null || name == null || type.isEmpty() || name.isEmpty()) return -1;

        if (type.equals("assiette")) {
            total += 15;
            total += getSizePrice(size);
            total += getDessertPrice(dsize);
            total = applyFormula(type, size, dsize, total);
        } else {
            total += 10;
            total += getSizePrice(size);
            total += getDessertPrice(dsize);
            total = applyFormula(type, size, dsize, total);
        }

        // Ajustement du prix du café
        if (coffee.equals("yes")) {
            if (!(type.equals("assiette") && size.equals("moyen") && dsize.equals("normal"))) {
                total += 1;
            }
        } else {
            total += 1;
        }

        return total;
    }

    private int getSizePrice(String size) {
        switch (size) {
            case "petit": return 2;
            case "moyen": return 3;
            case "grand": return 4;
            default: return 0;
        }
    }

    private int getDessertPrice(String dsize) {
        return dsize.equals("normal") ? 2 : 4;
    }

    private int applyFormula(String type, String size, String dsize, int total) {
        if (type.equals("assiette")) {
            if (size.equals("moyen") && dsize.equals("normal")) {
                System.out.print("Prix Formule Standard appliquée ");
                return 18;
            } else if (size.equals("grand") && !dsize.equals("normal")) {
                System.out.print("Prix Formule Max appliquée ");
                return 21;
            }
        } else {
            if (size.equals("moyen") && dsize.equals("normal")) {
                System.out.print("Prix Formule Standard appliquée ");
                return 13;
            } else if (size.equals("grand") && !dsize.equals("normal")) {
                System.out.print("Prix Formule Max appliquée ");
                return 16;
            }
        }
        return total;
    }
}
