package info.halo9pan.algorithm.sort;

import java.util.Arrays;

import info.halo9pan.algorithm.FibonacciNumber;
import info.halo9pan.algorithm.RandomNumber;

public class Shell {

	private static final int COUNT = 256;
	private static final int FROM = 0;
	private static final int TO = 1000;

	public static void sort() {
		int a[] = RandomNumber.integer(COUNT, FROM, TO);
		System.out.println(Arrays.toString(a));
		int[] steps = FibonacciNumber.until(COUNT, true);
		for (int s = 0; s < steps.length; s++) {
			int step = steps[s];
			if (step < 1) {
				break;
			}
			for (int i = 0; i < step; i++) {
				for (int j = step + i; j < a.length; j += step) {
					for (int k = j; k >= step; k -= step) { // 数组前半段有序
						if (a[k - step] > a[k]) {
							int temp = 0;
							temp = a[k];
							a[k] = a[k - step];
							a[k - step] = temp;
							System.out.println(step + ":" + Arrays.toString(a));
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		sort();
	}

}
