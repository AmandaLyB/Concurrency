package module8;

// sums second half of array
public class Q2Thread extends Thread {

	static int sum = 0;
	boolean exit = false;
	
	public void run() {
		for (int i = 100000000; i < 200000000; i++) {
			sum += Main.array[i];
		}
		exit = true;
	}
}
