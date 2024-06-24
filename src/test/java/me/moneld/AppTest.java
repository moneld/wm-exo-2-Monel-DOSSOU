package me.moneld;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCompute() {
        App app = new App();
        assertEquals(18, app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "yes"));
        assertEquals(19, app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "no")); 
        assertEquals(21, app.Compute("assiette", "couscous", "coca", "grand", "baba", "special", "yes")); // 21, formule max
        assertEquals(22, app.Compute("assiette", "couscous", "coca", "grand", "baba", "special", "no")); // 21 + 1 (pas de café)
        assertEquals(17, app.Compute("assiette", "couscous", "coca", "petit", "baba", "normal", "yes")); // 15 + 2 (boisson) + 2 (dessert) - 2 (1 café offert, 1 café payé)
        assertEquals(18, app.Compute("assiette", "couscous", "coca", "petit", "baba", "normal", "no")); // 15 + 2 (boisson) + 2 (dessert) + 1 (pas de café)
        assertEquals(13, app.Compute("sandwich", "sandwich", "coca", "moyen", "baba", "normal", "yes")); // 13, formule standard
        assertEquals(14, app.Compute("sandwich", "sandwich", "coca", "moyen", "baba", "normal", "no")); // 13 + 1 (pas de café)
        assertEquals(16, app.Compute("sandwich", "sandwich", "coca", "grand", "baba", "special", "yes")); // 16, formule max
        assertEquals(17, app.Compute("sandwich", "sandwich", "coca", "grand", "baba", "special", "no")); // 16 + 1 (pas de café)
        assertEquals(14, app.Compute("sandwich", "sandwich", "coca", "petit", "baba", "normal", "yes")); // 10 + 2 (boisson) + 2 (dessert) + 1 (café)
        assertEquals(15, app.Compute("sandwich", "sandwich", "coca", "petit", "baba", "normal", "no")); // 10 + 2 (boisson) + 2 (dessert) + 1 (pas de café)
    }
}
