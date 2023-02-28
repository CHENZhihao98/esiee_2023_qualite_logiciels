package fr.Zchen.models;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyBagTest {
    private static MoneyBag bag;

    @BeforeAll
    public static void init() {
        bag = new MoneyBag();
    }
    @Test
    @DisplayName("Create Bag")
    void test() {
        bag.add(50, Currency.EUR);
        assertEquals(50,bag.getTheCurrency(String.valueOf(Currency.EUR)),"not the same amount");
        System.out.print("Table Created");
    }
    @Test
    public void testAddBag() {
        int amount = 10;

        MoneyBag moneyBag = new MoneyBag();
        moneyBag.add(amount, Currency.EUR);
        Money money = new Money(amount, Currency.EUR);
        moneyBag.add(money);
        moneyBag.add(bag);

    }

    //    @Test
//    @DisplayName("AssertEquals")
//    void testAssertEquals() {
//        assertEquals("EUR",m.currency(),"Error currency not match");
//    }
//
//    @AfterEach
//    void after(){
//        m.minus(2,"EUR");
//    }
//
    @AfterAll
    static void afterAll(){
    }
}
