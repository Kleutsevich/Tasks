package jc01_2020.Kleautsevich.lesson09.task01;

/*
 *
 * Заполнить список строками. Вывести в консоль самую длинную строку
 *
 */

import java.util.ArrayList;
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
        int i = 0;
        int string, indexOfMax = 0, maxLen = strings.get(0).length();
        while (i < strings.size() - 1) {
            string = strings.get(++i).length();
            if (string > maxLen) {
                indexOfMax = i;
                maxLen = string;
            }
        }
        System.out.println("Строка максимальной длины: " + strings.get(indexOfMax) + ", длина: " + maxLen);
    }
}
