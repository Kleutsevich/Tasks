package jc01_2020.Kleautsevich.lesson04;

/*
 *
 * Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b] (квадратные скобки означают,
 * что крайние значения так же включаются в интервал).
 * Освободившиеся в конце массива элементы заполнить нулями.
 *
 * Пример: {4, 10, 18, 5, 11, 22, 13}. Интервал [10, 18].
 * Ответ:
 * 4
 * 5
 * 22
 * 0
 * 0
 * 0
 * 0
 *
 * Формат вывода:
 * значение каждой ячейки массива с новой строки
 *
 */

import java.util.Scanner;

public class TaskB1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int a = scanner.nextInt();
		int b = scanner.nextInt();


		//       int[] array2 = new int[7];
		//       for (int i = 0; i < array.length; i++) {
		//           if (array[i] < a || array[i] > b) {
		//               array2[i] = array[i];
		//           }
		//       }
		//       for (int i = 0; i < array2.length; i++)
		//       System.out.println(array2[i]);


		int zero = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= a && array[i] <= b) {
				zero++;
			} else {
				System.out.println(array[i]);
			}
		}
		for (int i = 0; i < zero; i++) {
			System.out.println(0);
		}
	}
}