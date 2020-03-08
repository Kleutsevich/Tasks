package jc01_2020.Kleautsevich.lesson10.task01;

/*
 *
 * Заполнить произвольное множество строками. Вывести в консоль размер множества. Добавить строку, которая уже есть во
 * множестве. Убедиться, что размер не изменился
 *
 */

import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		HashSet<String> wordsHashSet = new HashSet<>();
		wordsHashSet.add("one");
		wordsHashSet.add("two");
		wordsHashSet.add("three");
		wordsHashSet.add("four");
		wordsHashSet.add("five");
		System.out.println(wordsHashSet.size());
		wordsHashSet.add("two");
		System.out.println(wordsHashSet.size());
	}
}
