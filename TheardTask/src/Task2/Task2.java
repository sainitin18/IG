package Task2;

import java.util.Random;

class Advice extends Thread{
	public void run() {
		String[] advices = {
	            "Never begin to stop and never stop to begin.",
	            "Only destination isn’t important, one should enjoy the journey.",
	            "Impossible itself says ‘I’m possible’.",
	            "To achive something we have to loose something."
	        };
		Random random = new Random();
        int index = random.nextInt(advices.length);
        System.out.println("Advice: " + advices[index]);
	}
}

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Advice a = new Advice();
		a.start();

	}

}
