package jc01_2020.Kleautsevich.lesson04;

/*
 *
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму и вывести в консоль его индекс.
 * Номер столбца будет определяться первым индексом.
 * Т.е. в исходной матрице int[4][3] 4 столбца по 3 строки
 *
 * Формат вывода:
 * одно число
 *
 */

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] array = new int[4][3];
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = scanner.nextInt();
			}
		}
		int[] column = new int[4];
		int sum = 0;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[0].length; i++) {
				sum += array[j][i];
			}
			column[j] = sum;
			sum = 0;
		}

		int max_index = 0;
		int max = column[max_index];

		for (int j = 0; j < column.length; j++) {
			if (column[j] > max) {
				max_index = j;
				max = column[j];
			}
		}
		System.out.println("====");
			System.out.println(max);
		System.out.println(max_index);
	}
}