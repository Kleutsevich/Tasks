package jc01_2020.Kleautsevich.lesson04;

/*
 *
 * Найти в массиве те элементы, значение которых больше среднего арифметического, взятого от всех элементов массива.
 *
 * Пример: {1, 2, 8, 4, 16, 10, 6}. Среднее: 6,71.
 * Вывод:
 * 8
 * 16
 * 10
 *
 * Формат вывода:
 * каждое число с новой строки. Сохранить порядок следования чисел в массиве
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeric = 0;
        int sr = 0;
        int sum = 0;
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }
        sr = sum / 7;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > sr) {
                numeric = array[i];
                System.out.println(numeric);
            }
        }
    }
}