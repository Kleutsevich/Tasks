package jc01_2020.Kleautsevich.lesson09.task02;

/*
 *
 * Заполнить список строками. Каждую новую строку вставлять в начало списка. Вывести в консоль строку, с которой
 * начинается список
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Объявить список
		ArrayList<String> strings = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
				String str = scanner.nextLine();
			// Заполнить список
				strings.add(0, str);
			}
		System.out.println(strings.get(0));
	}
}
