package jc01_2020.Kleautsevich.lesson05;

/*
 *
 * Найти в строке указанную подстроку, заменить ее на новую и вывести в консоль результат. Строку, ее подстроку для
 * замены и новую подстроку вводит пользователь.
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String old = scanner.nextLine();
        String output = scanner.nextLine();
        String newStr = str.replace(old, output);
        System.out.println(newStr);
    }
}
