package ru.netology;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println();
        NewMathOperations newMathOperations = new NewMathOperations();
        List<Integer> list = Arrays.asList(12, 77, 32, 71, -54, -12, 12, -17, 45);
        System.out.println("Операции с листом: " + list);
        System.out.println("Лист положительных чисел: " + newMathOperations.positiveNumbers(list));
        System.out.println("Лист четных чисел: " + newMathOperations.evenNumber(list));
        System.out.println();
        System.out.println("Расчет комиссии:");
        int sum1 = 750;
        System.out.println("С суммы " + sum1 + "руб., комиссия составит: " + newMathOperations.commissionPercentCalc(sum1) + "руб.");
        int sum2 = 75700;
        System.out.println("С суммы " + sum2 + "руб., комиссия составит: " + newMathOperations.commissionPercentCalc(sum2) + "руб.");
    }
}