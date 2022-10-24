package module8;

// sums first half of array
public class Q1Thread extends Thread{

	static int sum = 0;
	boolean exit = false;
	
	public void run() {
		for (int i = 0; i < 100000000; i++) {
			sum += Main.array[i];
		}
		exit = true;
	}
}
