package jc01_2020.Kleautsevich.lesson03;

/*
 *
 * Нарисовать диагонали квадрата с заданной длиной стороны
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		for (int i = 0; i <= length; i++) {
			for (int j = 0; j <= length; j++) {
				if (i == j || i == length - j) {
					System.out.print("-");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
