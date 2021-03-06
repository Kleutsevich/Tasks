package jc01_2020.Kleautsevich.lesson03;

/*
 *
 * Угадать случайное число
 * В программе генерируется случайное целое число от 0 до 100. Пользователь должен его отгадать не более чем за 10 попыток.
 * После каждой неудачной попытки должно сообщаться больше или меньше введенное пользователем число, чем то, что загадано.
 * Если за 10 попыток число не отгадано, то вывести загаданное число.
 *
 * Теста на это задание нет, поиграйтесь сами против компьютера
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = (int) (Math.random() * 100 + 1);
        int i = 0;
        int n;
        while (i <= 10) {
            i++;
            if (i == 11) {
                System.out.println("Попытки закончились. Загаданное число: " + secret);
            } else {
                n = scanner.nextInt();
                if (n < secret) {
                    System.out.println("меньше ");
                } else {
                    if (n > secret) {
                        System.out.println("больше");
                    } else {
                            System.out.println("Вы угадали " + secret);
                            break;
                        }
                    }
                }
            }
        }
    }