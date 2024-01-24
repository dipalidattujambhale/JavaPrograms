package multithreading;

public class ThreadType extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ThreadType t1 = new ThreadType();
       ThreadType t2 = new ThreadType();
       ThreadType t3 = new ThreadType();
       t1.setName("Thread1");
       t2.setName("Thread2");
       t3.setName("Thread3");
      
        t1.setDaemon(true);
        
        t1.start();
        t2.start();
        t3.start();
	}
@Override
public void run() {
	if(Thread.currentThread().isDaemon()) {
	System.out.println("functionality of Daemon Thread :" +getName());
	}else {
		System.out.println("Functionality of user Thread :" +getName());
	}
	}
}
