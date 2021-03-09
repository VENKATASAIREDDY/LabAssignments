import java.util.Date;

class TimerThread implements Runnable{
	
	@Override
	public void run() {
		while(true) {
		System.out.println("Timer: "+ new Date());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}

public class Exercise2 {

	public static void main(String[] args) {
		TimerThread tt=new TimerThread();
		Thread t1=new Thread(tt);
		t1.start();

	}

}
