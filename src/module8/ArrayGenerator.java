package module8;

import java.util.Random;

public class ArrayGenerator {
	
	public static int[] arrayGenerator() {
	
		// upgrade to 200 million
		int[] array = new int[100];
	
		Random rand = new Random();

		for(int i = 0; i < 100; i++) {
		    int answer = rand.nextInt(10) + 1;
		    array[i] = answer;
		}
		return array;
	}
	
}
