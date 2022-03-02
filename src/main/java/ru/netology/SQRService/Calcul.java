package ru.netology.SQRService;

public class Calcul {
    public int sqrtcalc(int max, int min) {
        int score = 0;
        int number = 99;
        for (int i = 10; i <= number; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    score++;
                }
            }
        }
        return score;
    }
}
