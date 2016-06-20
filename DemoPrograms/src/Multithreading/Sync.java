package Multithreading;

public class Sync {
	
	public void count()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Counter--"+i);
		}
	}

}

class Synchro extends Thread
{
	
	  private Thread t;
	   private String threadName;
	Sync ss;
	
	   Synchro( String name,  Sync SS){
	       threadName = name;
	       ss = SS;
	   }
	   
	   
	public void run()
	{
		synchronized (ss) {
			ss.count();
		}
		
		System.out.println("Thread " +  threadName + " exiting.");

	}
	
	
	public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
}

class Testthread
{
	public static void main(String[] args)
	{
		
		Sync s = new Sync();
		Synchro s1 = new Synchro("Thread-1", s);
		Synchro s2 = new Synchro("Thread-2", s);
		
		s1.start();
		s2.start();
		
		try
		{
			s1.join();
			s2.join();

		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}	
}