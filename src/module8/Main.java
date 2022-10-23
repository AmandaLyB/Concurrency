package module8;

public class Main extends Thread{

	static int[] array = ArrayGenerator.arrayGenerator();
	
	public static void main(String[] args) {

		
		//Main thread = new Main();
		//thread.start();

		int sum = 0;
		int cur = 0;
		
		
		// single thread sum
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			cur = array[i];
			sum += cur;
			System.out.println("current: " + cur + " = " + sum);
		}
		long end = System.currentTimeMillis();
		System.out.println("Single thread: " + (end - start) + "ms.");
		
		Q1Thread thread1 = new Q1Thread();
		Q2Thread thread2 = new Q2Thread();
		
		start = System.currentTimeMillis();
		
		thread1.start();
		thread2.start();
		
		
		
		end = System.currentTimeMillis();
		
	}
}
