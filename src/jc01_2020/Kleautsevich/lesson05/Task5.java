package jc01_2020.Kleautsevich.lesson05;

/*
 *
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef".
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			String str2 = str.substring(i, i + 1);
			if (sb.indexOf(str2) == -1) {
				sb.append(str2);
			}
		}
//		str.chars().distinct().forEach(c -> sb.append((char) c)); {
		System.out.println(sb);
			}
		}