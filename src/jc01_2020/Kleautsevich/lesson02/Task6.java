package jc01_2020.Kleautsevich.lesson02;

/*
*
* Вводится целое число, обозначающее код символа по таблице ASCII. Определить, это код английской
* буквы (большой или маленькой) или какой-либо иной символ.
*
* Формат вывода (ошибки недопустимы):
* "Да"
* "Нет"
*
* Принимается любой вариант решения, но с точки зрения чтения и поддержки кода предпочтителен вариант решения через
* сравнение символов (см. приведение типов)
*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        char codeChar = (char) code;
        {
            if (code >= 'A' && code <= 'Z' || code >= 'a' && code <= 'z') {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
}
