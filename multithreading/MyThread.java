package multithreading;

public class MyThread extends Thread {

	@Override
	public void run() {

		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Currently excuting Threade :" + getName());
		}

	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();//creating Thread
		t1.setName("Dipali ");//setting thread name
		t1.start();//starting a thread

		MyThread t2 = new MyThread();
		t2.setName("Jagdish");
		t2.start();

	}
}
