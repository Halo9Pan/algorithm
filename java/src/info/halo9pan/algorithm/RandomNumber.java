package info.halo9pan.algorithm;

import java.util.Random;

public class RandomNumber {
	
	public static int[] integer(int range){
		int[] numbers = new int[range];
		Random r = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt();
		}
		return numbers;
	}

}
