package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    //все попадают в диапазон
    @Test
    void sqrtCalcHits() {
        SQRService service = new SQRService();
        int max = 300;
        int min = 200;
        int expected = 3;

        int actual = service.sqrtCalc(max, min);
        System.out.println(actual);

        assertEquals(expected,actual);
    }

    //ничего не попадает в диапазон
    @Test
    void sqrtCalcDoesNotFall() {
        SQRService service = new SQRService();
        int max = 90;
        int min = 50;
        int expected = 0;

        int actual = service.sqrtCalc(max, min);
        System.out.println(actual);

        assertEquals(expected,actual);
    }

    //один попадает в диапазон
    @Test
    void sqrtCalcHitsOne() {
        SQRService service = new SQRService();
        int max = 100;
        int min = 50;
        int expected = 1;

        int actual = service.sqrtCalc(max, min);
        System.out.println(actual);
        assertEquals(expected,actual);
    }
}