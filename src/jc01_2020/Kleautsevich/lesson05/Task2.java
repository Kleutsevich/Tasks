package jc01_2020.Kleautsevich.lesson05;

/*
 *
 * Вводится строка. Удалить из нее все пробелы. После этого определить, является ли она палиндромом (перевертышем),
 * т.е. одинаково пишется как с начала, так и с конца. Регистр букв не учитывать
 *
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.replaceAll(" ", "");

            StringBuilder newStr = new StringBuilder(str);
            newStr.reverse();
            if (newStr.toString().equalsIgnoreCase(str)) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
