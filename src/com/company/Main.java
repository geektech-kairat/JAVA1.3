package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double mas1[] = new double[15];


        //он будет хранить положительные числа
        int postiveNum = 0;


        //для формулироки мас1

        int j = 0;
        for (double element : mas1) {
            element = Math.random() * 30 - 15;
            mas1[j] = element;
            if (mas1[j] > 0) {
                postiveNum++;

            }
            j++;

        }
        System.out.println("первый массив");
        System.out.println(Arrays.toString(mas1));
        System.out.println();

        double mas2[] = new double[postiveNum];
        int index = 0;

        int t = 0;

        for (double element2 : mas1) {
            mas1[t] = element2;

            if (mas1[t] > 0) {
                mas2[index] = mas1[t];
                index++;

            }
            t++;

        }
        System.out.println("массив 2");
        System.out.println(Arrays.toString(mas2));
        System.out.println();

        //сумма втрого массива
        double sumNummas2 = 0;
        int r = 0;
        for (double element2 : mas2) {
            sumNummas2 = sumNummas2 + mas2[r];
            r++;
        }

        System.out.println("Среднее африметическое числа второго массива: " + sumNummas2 / mas2.length);
    }
}
