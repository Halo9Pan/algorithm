package info.halo9pan.algorithm.sort;

import java.util.Arrays;

import info.halo9pan.algorithm.RandomNumber;

public class Select {
	
	private static final int COUNT = 100;
	private static final int FROM = 0;
	private static final int TO = 1000;

	public static void sort() {
		int a[] = RandomNumber.integer(COUNT, FROM, TO);
		System.out.println(Arrays.toString(a));
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					System.out.println(Arrays.toString(a));
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		sort();
	}

}
