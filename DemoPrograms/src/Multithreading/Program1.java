package Multithreading;

public class Program1 extends Thread{

	public void run()
	{
		
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		
		Program1 pm = new Program1();
		pm.start();
	}

}
