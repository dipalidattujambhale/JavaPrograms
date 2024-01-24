package multithreading;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		while (true) {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Currently executing thread : " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 myThread2 = new MyThread2();
		Thread t1 = new Thread(myThread2);
		t1.setName("Akshu");
		t1.start();

		Thread t2 = new Thread(myThread2);
		t2.setName("Riya");
		t2.start();
	}

}
