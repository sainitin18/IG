package Task3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Clock extends Thread{
	private boolean running = true;
	void stopClock() {
		running = false;
	}
	public void run() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		while(running) {
			LocalTime time = LocalTime.now();
	        System.out.println("Current Time: " + time.format(formatter));
	        try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock();
		c.start();
		Scanner s = new Scanner(System.in);
        System.out.println("Press ENTER to stop the clock...");
        s.nextLine(); 
        c.stopClock(); 
        s.close();
	}

}
