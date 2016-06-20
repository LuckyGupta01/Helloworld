package Multithreading;

public class Prg2 implements Runnable
{
	public void run() 
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		
		Prg2 pg  = new Prg2();
		Thread t = new Thread(pg);
		t.start();

	}

}
