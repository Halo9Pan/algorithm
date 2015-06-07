package info.halo9pan.algorithm.sort;

import java.util.Arrays;

import info.halo9pan.algorithm.RandomNumber;

public class Insert {

	private static final int COUNT = 16;
	private static final int FROM = 0;
	private static final int TO = 100;

	public static void sort() {
		int a[] = RandomNumber.integer(COUNT, FROM, TO);
		System.out.println(Arrays.toString(a));
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) { // 数组前半段有序
				if (a[j - 1] > a[j]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
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
