package info.halo9pan.algorithm.sort;

import java.util.Arrays;

import info.halo9pan.algorithm.RandomNumber;

public class Bubble {
	
	private static final int COUNT = 10;

	public static void sort() {
		int a[] = RandomNumber.integer(COUNT);
		System.out.println(Arrays.toString(a));
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					System.out.println(Arrays.toString(a));
				}
			}
		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public static void main(String[] args) {
		sort();
	}

}
