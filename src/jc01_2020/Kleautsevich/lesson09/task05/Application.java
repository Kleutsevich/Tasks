package jc01_2020.Kleautsevich.lesson09.task05;

/*
 *
 * Заполнить два списка целыми числами. Из первого списка удалить все отрицательные числа. Из второго - все положительные.
 * Создать третий список, состоящий из оставшихся элементов первых двух. Из третьего списка удалить все элементы со
 * значением 0. Вывести итоговый список в консоль. Максимально использовать готовые методы коллекций
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        ArrayList<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Integer numeric = scanner.nextInt();
//			String str = scanner.nextLine();
            // Заполнить список
            numbers1.add(numeric);
        }
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Integer numeric = scanner.nextInt();
            numbers2.add(numeric);
        }
        for (int i = 0; i < numbers1.size(); i++) {
            numbers1.removeIf(value -> value < 0);
        }
        for (int i = 0; i < numbers2.size(); i++) {
            numbers2.removeIf(value -> value > 0);
        }
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.addAll(numbers1);
        numbers3.addAll(numbers2);
        for (int i = 0; i < numbers3.size(); i++) {
            if (numbers3.get(i) == 0) {
                numbers3.remove(i);
            }
        }
        Integer[] numbersArray = numbers3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(numbersArray));
    }
}
