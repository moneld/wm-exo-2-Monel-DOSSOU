package me.moneld;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCompute() {
        App app = new App();
        assertEquals(18, app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "yes"));
        assertEquals(19, app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "no"));
        assertEquals(21, app.Compute("assiette", "couscous", "coca", "grand", "baba", "special", "yes"));
        assertEquals(22, app.Compute("assiette", "couscous", "coca", "grand", "baba", "special", "no"));
        assertEquals(17, app.Compute("assiette", "couscous", "coca", "petit", "baba", "normal", "yes"));
        assertEquals(18, app.Compute("assiette", "couscous", "coca", "petit", "baba", "normal", "no"));
        assertEquals(13, app.Compute("sandwich", "sandwich", "coca", "moyen", "baba", "normal", "yes"));
        assertEquals(14, app.Compute("sandwich", "sandwich", "coca", "moyen", "baba", "normal", "no"));
        assertEquals(16, app.Compute("sandwich", "sandwich", "coca", "grand", "baba", "special", "yes"));
        assertEquals(17, app.Compute("sandwich", "sandwich", "coca", "grand", "baba", "special", "no"));
        assertEquals(14, app.Compute("sandwich", "sandwich", "coca", "petit", "baba", "normal", "yes"));
        assertEquals(15, app.Compute("sandwich", "sandwich", "coca", "petit", "baba", "normal", "no"));
    }
}
