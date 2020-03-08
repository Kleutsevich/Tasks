package jc01_2020.Kleautsevich.lesson09.task03;

/*
 *
 * Заполнить список строками. 5 раз перенести последний элемент списка в начало. Вывести в консоль значения списка в
 * виде массива (["str1","str2","str3"...])
 *
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Объявить список
		ArrayList<String> strings = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			String str = scanner.nextLine();
			// Заполнить список
			strings.add(str);
		}
		int n = 0;
		while (n < 5) {
			strings.add(0, strings.get(strings.size() - 1));
			strings.remove(strings.size() -1);
			n++;
		}
		String[] stringsArray = strings.toArray(new String[0]);
		System.out.println(Arrays.toString(stringsArray));
	}

}
