package fr.ldumay.models;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    private static Sqrt sqrt;

    /**
     * init list max and min value, then check if min < max
     */
    @BeforeAll
    public static void init() {
        sqrt = new Sqrt();
        sqrt.init(1,10);

        assertTrue(sqrt.getMin()<sqrt.getMax(),"Min is not < to Max");
    }

    @Test
    void testAddVal(){
        sqrt.addSqrtValue();
        assertFalse(sqrt.getList().isEmpty(),"insert false");
    }

    @AfterAll
    static void testGetValue(){
        for (double value : sqrt.getList()) {
            System.out.println(value);
            assertTrue(Double.isNaN(value),"it's not a number");
        }
    }
}
