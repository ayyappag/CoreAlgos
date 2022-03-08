package com.core.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseList {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		int[] temparray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Reverse order of given List :- ");

		for (int k = 0, j = number.size() - 1; k < j; k++) {
			number.add(k, number.remove(j));
		}

		/*
		 * above and below same int j = number.size()-1; for (int k = 0; k < j; k++) {
		 * number.add(k, number.remove(j)); }
		 */

		System.out.println(number);
		System.out.println("Approach 2 ");
		Collections.reverse(number);
		System.out.println(number);

		System.out.println(" example for int array");
		app2(temparray);

		app3(temparray);
	}

	public static void app2(int[] temparray) {

		System.out.println(" initial - " + Arrays.toString(temparray));

		int left, right = 0;
		right = temparray.length - 1;
		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			int temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		System.out.println(" initial - " + Arrays.toString(temparray));
	}

	// time complexity =0(n) and constant space 0(1)
	public static void app3(int[] temparray) {
		System.out.println(" initial 3- " + Arrays.toString(temparray));

		int left = 0, right = 0;
		right = temparray.length - 1;

		while (left < right) {
			int temp = temparray[left];
			temparray[left++] = temparray[right];
			temparray[right--] = temp;
			// left++;
			// right--;
		}

		System.out.println(" final - " + Arrays.toString(temparray));
	}

	
	// list reverse
	public static void java8Methods(List<Integer> list) {

		IntStream.range(0, list.size())
				.map(i -> (list.size() - 1 - i)) // IntStream
				.mapToObj(list::get) // Stream<T>
				.collect(Collectors.toCollection(ArrayList::new));

		IntStream.range(0, list.size())
				 .mapToObj(i -> list.get(list.size() - 1 - i))
				.collect(Collectors.toCollection(ArrayList::new));

		list.stream().collect(
				Collectors.collectingAndThen(
						Collectors.toCollection(ArrayList::new), lst -> {
			Collections.reverse(lst);
			return lst.stream();
		})).collect(Collectors.toCollection(ArrayList::new));

		Collections.reverse(list);

		new LinkedList<>(list) // LinkedList
				.descendingIterator() // Iterator
				.forEachRemaining(System.out::println);

	}

}
