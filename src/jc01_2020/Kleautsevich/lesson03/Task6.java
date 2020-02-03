package jc01_2020.Kleautsevich.lesson03;

/*
 *
 * Вывести на экран "прямоугольник", образованный из двух видов символов.
 * Контур прямоугольника должен состоять из одного символа, а "заливка" - из другого.
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//        int horizontal = scanner.nextInt();
//        int vertical = scanner.nextInt();
//        System.out.print("");
//        System.out.println("");
		char horizontal = scanner.next().charAt(0);
		char vertical = scanner.next().charAt(0);
		for (int i = 0; i < 11; i++) {
			if (i == 0 || i == 10) {
				for (int j = 0; j < 16; j++) {
					System.out.print(horizontal);
				}
				System.out.println("");
			} else {
				System.out.print(horizontal);
				for (int j = 1; j < 15; j++) {
					System.out.print(vertical);
				}
				System.out.println(horizontal);
			}
		}
	}
}