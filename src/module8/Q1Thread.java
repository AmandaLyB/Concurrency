package module8;

public class Q1Thread extends Thread{

	
	public void run() {
		
		int sum = 0;
		for (int i = 0; i < 50; i++) {
			sum += Main.array[i];
		}
	}
}
