package info.halo9pan.algorithm.sort;

import java.util.Arrays;

import info.halo9pan.algorithm.RandomNumber;

public class Select {

	private static final int COUNT = 16;
	private static final int FROM = 0;
	private static final int TO = 100;

	public static void sort() {
		int a[] = RandomNumber.integer(COUNT, FROM, TO);
		System.out.println(Arrays.toString(a));
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i; j < a.length; j++) {
				min = a[j] < a[min] ? j : min;
			}
			if (min != i) {
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
				System.out.println(Arrays.toString(a));
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		sort();
	}

}
