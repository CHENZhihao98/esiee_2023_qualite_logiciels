package fr.Zchen.models;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    private static Sqrt sqrt;
    private static Sqrt sqrt2;


    /**
     * init list max and min value, then check if min < max
     */
    @BeforeAll
    public static void init() {
        Integer max = 10;
        Integer min = 1;

        sqrt = new Sqrt();
        sqrt.init(min,max);

        assertTrue(sqrt.getMin()<sqrt.getMax(),"Min is not < to Max");
    }

    @Test
    void testAddVal(){
        sqrt.addSqrtValue();
        Integer nbElement = sqrt.getNbElement();

        System.out.println(nbElement);

        assertEquals((int) sqrt.getNbElement(), sqrt.getMax() - sqrt.getMin(), "Le nombre d'elément incorrect");
        assertFalse(sqrt.getList().isEmpty(),"insert false");
    }
    /**
     * Test d'exécution de la méthode racineCarree().
     */
    @Test
    @DisplayName("racineCarree() | Exécution")
    void testCalculRacineCarreeExecution() {

        //Vérification des égalités
        assertEquals(1.0, sqrt.racineCarree(1),"function not working");
        assertEquals(2.0, sqrt.racineCarree(4),"function not working");
    }
    /**
     * Test de temps d'exécution de la méthode racineCarree().
     */
    @Test
    @DisplayName("racineCarree() | Temps d'exécution")
    void testCalculRacineCarreeTimeout() {
        int time = 2;
        //Vérification du temps d'exécution
        assertTimeout(
                Duration.ofMillis(time),
                () -> sqrt.racineCarree(1),
                "Erreur de temps d'exécution"
        );
        assertTimeout(
                Duration.ofMillis(time),
                () -> sqrt.racineCarree(4),
                "Erreur de temps d'exécution"
        );
    }

    /**
     * Test de temps d'exécution de la méthode racineCarree().
     */
    @Test
    @DisplayName("Clear List")
    void testClearList() {
        sqrt2 = new Sqrt();
        sqrt2.init(1,10);
        sqrt2.addSqrtValue();
        assertFalse(sqrt2.getList().isEmpty(),"insert false");

        sqrt2.clearList();
        assertTrue(sqrt2.getList().isEmpty(),"method clear not working");

    }
    @AfterAll
    static void testGetValue(){
        for (double value : sqrt.getList()) {
            assertFalse(Double.isNaN(value),"it's not a number");
            System.out.println(value);
        }
    }
}
