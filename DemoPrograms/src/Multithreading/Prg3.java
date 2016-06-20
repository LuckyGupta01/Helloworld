package Multithreading;

class A extends Thread
{
	public void run()
	{
		System.out.println("Thread 2 is running");
	}
}

class B extends Thread
{
	public void run()
	{
		System.out.println("Thread 3 is running");
	}
}


class Prg3 extends Thread {

	public void run()
	{
			System.out.println("Thread 1 is Running");
	}
	
	public static void main(String[] args) 
	{
		
		Prg3 pg = new Prg3();
		B bb = new B();
		A aa= new A();
		
		pg.setPriority(Thread.MIN_PRIORITY);
		aa.setPriority(Thread.NORM_PRIORITY);
		bb.setPriority(Thread.MAX_PRIORITY);
		bb.start();
		aa.start();
		pg.start();
		
	}

}

	



	
	