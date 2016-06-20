package Multithreading;


class table
{
	void Printtable(int n)
	{
		synchronized (this) {
			for(int i=1;i<=5;i++)
			{
				System.out.println(n*i);
				try 
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
		}
	}
}

class Mythread1 extends Thread
{
	table t;
	public Mythread1(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.Printtable(5);
	}
}

class Mythread2 extends Thread
{
	table t;
	public Mythread2(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.Printtable(7);
	}
}

public class TestSync {

	public static void main(String[] args) {
		
		table t = new table();
		Mythread1 th1 = new Mythread1(t);
		Mythread2 th2 = new Mythread2(t);
		
		th2.start();
		th1.start();


	}

}
