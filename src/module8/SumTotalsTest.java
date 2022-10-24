package module8;

import static org.junit.Assert.*;

import org.junit.Test;


// tests that both Main.arraySum() and Main.threadSum() 
//have the same result

public class SumTotalsTest {

	@Test
	public void test() {
		
		int[] array = ArrayGenerator.arrayGenerator();
		int sum = Main.arraySum(array);
		int total = Main.threadSum(array);
		
		
		System.out.println("Total for 2 threads: " + total + "\nTotal for single thread: " + sum);
		assertEquals(total, sum);
	}

}
