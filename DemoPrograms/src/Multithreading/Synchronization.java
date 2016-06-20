package Multithreading;


class demo 
{
	void message(String msg)
	{
		System.out.println("#"+msg);
		
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("#");
	}
}

class first extends Thread
{
	demo obj;
	String str;
	public first(demo fp,String msg)
	{
		obj = fp;
		str = msg;
	}
	
	public void run()
	{
		synchronized (obj) {
			
			obj.message(str);
			
		}
	}
}

public class Synchronization {

	public static void main(String[] args) {

demo d = new demo();
first f = new first(d, "welcome");
first f1 = new first(d, "to");
first f2 = new first(d, "java");
f.start();
f1.start();
f2.start();
	}

}
