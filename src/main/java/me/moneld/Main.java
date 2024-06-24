package me.moneld;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        int price = app.Compute(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
        System.out.println("Prix à payer : " + price + "€");
    }
}
