package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] namber = {9.1, -9.2, 9.3, 9.4, 9.5, -9.6, 9.7, -9.8, 9.9, 10.1, 10.2, 11.1, 12.3, 13.4, -14.8};
        boolean isPositive = false;
        double num = 0;
        double number = 0;
        for (double array : namber) {
            if (isPositive) {
                num += array;
                number++;
            } else if (array < 0.0) {
                isPositive = true;
            }
        }
        double res = (num / number);

        boolean isSorted = false;
        double buf;
        while (!isSorted) {
            isSorted = true;
            for (int b = 0; b < namber.length - 1; b++) {
                if (namber[b] > namber[b + 1]) {
                    isSorted = false;

                    buf = namber[b];
                    namber[b] = namber[b + 1];
                    namber[b + 1] = buf;
                }
            }
        }
        System.out.println("Ваше арифметическое число: " + res);
        System.out.println(Arrays.toString(namber));
    }
}



