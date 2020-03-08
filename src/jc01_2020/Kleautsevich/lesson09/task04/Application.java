package jc01_2020.Kleautsevich.lesson09.task04;

/*
 *
 * Заполнить список натуральными числами (целые положительные). Вывести в консоль среднее арифметическое всех четных
 * значений
 *
 * N.B. Ноль не является натуральным числом
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer numeric = scanner.nextInt();
            // Заполнить список
            numbers.add(numeric);
        }
        double sum = 0, n = 0, sr = 0;
		for (Integer number : numbers) {
			if (number % 2 == 0 && number != 0) {
				sum = sum + number;
				n++;
			}
		}
		sr = sum / n;
        System.out.println(sr);
    }
}
