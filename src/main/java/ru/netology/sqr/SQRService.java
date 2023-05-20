package ru.netology.sqr;

public class SQRService {

    public int calcSQR (int a, int b) {

        int Sum = 0;

        for (int i = 10; i <= 99; i++) {
            if (a <= i * i && i * i <= b) {
                Sum++;
            }
        }
        return (Sum);
    }
}
