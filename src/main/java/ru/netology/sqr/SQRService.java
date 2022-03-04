package ru.netology.sqr;

public class SQRService {
    public int sqrtCalc(int max, int min) {
        int score = 0;
        int number = 99;
        for (int i = 10; i <= number; i++) {
            if (i * i >= min && i * i <= max) {
                score++;
            }
        }
        return score;
    }
}
