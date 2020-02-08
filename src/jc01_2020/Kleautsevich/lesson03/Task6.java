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
      int horizontal = scanner.nextInt();
       int vertical = scanner.nextInt();
//        System.out.print("");
//        System.out.println("");
		for (int i = 0; i < vertical; i++) {
			if (i == 0 || i == vertical - 1) {
				for (int j = 0; j < horizontal; j++) {
					System.out.print("*");
				}
				System.out.println("");
			} else {
				System.out.print("*");
				for (int j = 1; j < horizontal - 1; j++) {
					System.out.print("+");
				}
				System.out.println("*");
			}
		}
	}
}