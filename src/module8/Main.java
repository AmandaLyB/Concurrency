package module8;

public class Main extends Thread{

	static int[] array;
	static int total = 0;
	static int sum = 0;
	
	// uses single thread to calculate sum of array
	public static int arraySum(int[] a) {
		array = a;
		int cur = 0;
		for (int i = 0; i < array.length; i++) {
			cur = array[i];
			sum += cur;
		}
		return sum;
	}
	
	// uses two threads to calculate sum of array
	public static int threadSum(int[] a) {
		array = a;
		Q1Thread thread1 = new Q1Thread();
		Q2Thread thread2 = new Q2Thread();
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		total = Q1Thread.sum + Q2Thread.sum;

		return total;
	}
	
	
	public static void main(String[] args) {

		array = ArrayGenerator.arrayGenerator();
		
		// single threaded sum
		long start = System.currentTimeMillis();
		arraySum(array);
		long end = System.currentTimeMillis();
		System.out.println("Single thread: " + sum + " in " + (end - start) + "ms.");
		
		// double threaded sum
		start = System.currentTimeMillis();
		threadSum(array);
		end = System.currentTimeMillis();
		System.out.println("Two thread method: " + total + " in " + (end-start) + "ms");
	}
}
