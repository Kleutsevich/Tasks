package jc01_2020.Kleautsevich.lesson03;

/*
 *
 * Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
 * Например, если введено число 3486, то надо вывести число 6843.
 *
 * Формат вывода (ошибки недопустимы):
 * одно число с учетом знака
 *
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();

		boolean negative = false;
		if (input < 0)  {
			negative = true;
			input = -input;
		}

		String result = "";
		while (input > 0) {
			long i = input % 10;
			input = input / 10;
			result += i;
		}

		if (negative) {
			result = "-" + result;
		}
		System.out.println(result);
	}
}
