package jc01_2020.Kleautsevich.lesson03;

/*
 *
 * С клавиатуры вводится целое число. Найти его наибольшую цифру
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 *
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        long n = 0;
        while (input > 0) {
            long i = input % 10;
            input = input / 10;
            {
                if (i > n) {
                    n = i;
                }
            }
        }
        System.out.println("Наибольшая цифра" + n);
    }
}
