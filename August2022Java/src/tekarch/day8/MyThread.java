// https://www.youtube.com/watch?v=PsGbbhEMeWU&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=2
// for linkedlist training...

package tekarch.day8;

public class MyThread extends Thread{
	public void run()
	{
		System.out.println("Thread is running.....");
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		
		
		t.start();
		

	}

}
