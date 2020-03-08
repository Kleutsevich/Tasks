package jc01_2020.Kleautsevich.lesson10.task02;

/*
 *
 * Заполнить множество случайными числами от 0 до 100. Удалить все числа, которые больше 50. Результат вывести в консоль.
 * Используйте Iterator
 *
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        HashSet<Integer> randomNumbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            Integer numeric = (int) (Math.random() * 100 + 1);
            // Заполнить список
            randomNumbers.add(numeric);
        }
		System.out.println(randomNumbers);
//        for (int i : randomNumbers) {
//            System.out.println(i);
//        }
        randomNumbers.removeIf(value -> value > 50);
		System.out.println(randomNumbers);
 //       randomNumbers.forEach(System.out::println);
    }

//    HashSet<Integer> removeAllNumbersThan50(HashSet<Integer> set) {
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Integer number = iterator.next();
//            if (number > 50) {
//                iterator.remove();
//            }
//        }
//        return (HashSet) set;
//    }
}
