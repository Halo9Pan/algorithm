package info.halo9pan.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibonacciNumber {

	public static int[] basic(int count) {
		int[] numbers = new int[count];
		numbers[0] = 0;
		numbers[1] = 1;
		for (int i = 2; i < numbers.length; i++) {
			numbers[i] = numbers[i - 1] + numbers[i - 2];
		}
		return numbers;
	}

	public static int[] until(int max, boolean reverse) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		int number = 0;
		for (int i = 2; number < max; i++) {
			number = list.get(i - 1) + list.get(i - 2);
			list.add(number);
		}
		if (reverse) {
			Collections.reverse(list);
		}
		int[] numbers = new int[list.size()];
		int index = 0;
		for (Integer l : list) {
			numbers[index++] = l;
		}
		return numbers;
	}

}
