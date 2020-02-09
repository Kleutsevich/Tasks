package jc01_2020.Kleautsevich.lesson04;

/*
 *
 * В одномерном массиве найти сумму элементов, находящихся между минимальным и максимальным элементами (их порядок не важен).
 * Сами минимальный и максимальный элементы в сумму не включать.
 *
 * Пример: {10, 30, 20, 15, 8, 21, 14}. max = 30, min 8. В сумму должны пойти значения 20 и 15. Ответ: 35
 *
 * Формат вывода:
 * одно число
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int maxIndex = 0;
        int max = array[maxIndex];
        int minIndex = 0;
        int min = array[minIndex];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                maxIndex = i;
                max = array[i];
            }
            if (array[i] < min) {
                minIndex = i;
                min = array[i];
            }
        }
        int startIndex = minIndex;
        int endIndex = maxIndex;
        if (minIndex > maxIndex) {
            startIndex = maxIndex;
            endIndex = minIndex;
        }
        int sum = 0;
        for (int j = startIndex + 1; j < endIndex; j++) {
            sum += array[j];
        }
        System.out.println(sum);
    }
}

