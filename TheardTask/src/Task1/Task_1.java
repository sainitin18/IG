package Task1;

class ConferenceRoom{
	private boolean flag = true;
	public synchronized void book(String manager) throws InterruptedException {
		if(flag) {
			System.out.println(manager + " You booked the room");
			flag = false;
			Thread.sleep(5000);
			System.out.println(manager + " has finished the meeting.");
			flag = true;
		}else {
			System.out.println(manager + " you cant book the room");
		}
	}
}

public class Task_1 extends Thread{
	ConferenceRoom cr;
	String manager;
	public Task_1(ConferenceRoom cr , String manager) {
		this.cr = cr;
		this.manager = manager;
		this.start();
	}
	public void run() {
		try {
			cr.book(manager);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ConferenceRoom cr = new ConferenceRoom();
		Task_1 t1 = new Task_1(cr,"Virat"); 
		Thread.sleep(1000);
		Task_1 t2 = new Task_1(cr,"Rohit");
	}

}
