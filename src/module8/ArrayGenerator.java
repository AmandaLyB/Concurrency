package module8;

import java.util.Random;

public class ArrayGenerator {
	
	// creates a random array of integers
	public static int[] arrayGenerator() {
	
		// upgrade to 200 million
		int[] array = new int[200000000];
	
		Random rand = new Random();

		for(int i = 0; i < 200000000; i++) {
		    int answer = rand.nextInt(10) + 1;
		    array[i] = answer;
		}
		return array;
	}
	
}
