package info.halo9pan.algorithm;

import java.util.Random;

public class RandomNumber {
	
	public static int[] integer(int count){
		int[] numbers = new int[count];
		Random r = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt();
		}
		return numbers;
	}

	public static int[] integer(int count, int from, int to){
		int[] numbers = new int[count];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = from + (int)(Math.random() * (to - from));
		}
		return numbers;
	}

}
