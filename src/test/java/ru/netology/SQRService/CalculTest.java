package ru.netology.SQRService;

import org.junit.jupiter.api.Test;

class CalculTest {

    @Test
    void sqrtcalchits() {
        Calcul service = new Calcul();
        int max = 300;
        int min = 200;

        int actual = service.sqrtcalc(max, min);
        System.out.println(actual);
    }

    @Test
    void sqrtcalcdoesnotfall() {
        Calcul service = new Calcul();
        int max = 90;
        int min = 50;

        int actual = service.sqrtcalc(max, min);
        System.out.println(actual);
    }

    @Test
    void sqrtcalchitsone() {
        Calcul service = new Calcul();
        int max = 100;
        int min = 50;

        int actual = service.sqrtcalc(max, min);
        System.out.println(actual);
    }
}