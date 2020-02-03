package jc01_2020.Kleautsevich.lesson03;

/*
 *
 * Вычислить факториал введенного числа. n >= 0 (0! = 1)
 * n! = 1 * 2 * 3 * 4 * ... * n
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeric = scanner.nextInt();
		int sum = 1;
		int i = 1;
		while (i <= numeric) {
			sum = sum * i;
			i++;
			}
		System.out.println(sum);
		}
	}