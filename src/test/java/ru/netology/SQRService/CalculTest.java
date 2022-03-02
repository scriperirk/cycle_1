package ru.netology.SQRService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculTest {
    //все попадают в диапазон
    @Test
    void sqrtcalchits() {
        Calcul service = new Calcul();
        int max = 300;
        int min = 200;
        int expected = 3;

        int actual = service.sqrtcalc(max, min);
        System.out.println(actual);

        assertEquals(expected,actual);
    }

    //ничего не попадает в диапазон
    @Test
    void sqrtcalcdoesnotfall() {
        Calcul service = new Calcul();
        int max = 90;
        int min = 50;
        int expected = 0;

        int actual = service.sqrtcalc(max, min);
        System.out.println(actual);

        assertEquals(expected,actual);
    }

    //один попадает в диапазон
    @Test
    void sqrtcalchitsone() {
        Calcul service = new Calcul();
        int max = 100;
        int min = 50;
        int expected = 1;

        int actual = service.sqrtcalc(max, min);
        System.out.println(actual);
        assertEquals(expected,actual);
    }
}