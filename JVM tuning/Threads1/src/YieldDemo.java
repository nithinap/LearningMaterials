
class MyThread implements Runnable{
	String name; //name of Thread
	Thread t;
	
	MyThread(String threadname){
		name=threadname;
		t = new Thread(this,name);
		System.out.println("New thread:"+t);
		t.start();
	}
	
	public void run(){
		try
		{
			System.out.println("Thread sleeping");
			Thread.sleep(4000);//milliseconds
			for(int i=5;i>0;i--)
			{
				System.out.println(name+":"+i);

			}
		}
		catch(Exception ie){
			System.out.println(name+" Interrupted");
		}
		
		System.out.println(name+" Exiting");
	}
}


class MyThread3 implements Runnable{
	String name; //name of Thread
	Thread t;
	
	MyThread3(String threadname){
		name=threadname;
		t = new Thread(this,name);
		System.out.println("New thread:"+t);
		t.start();
	}
	
	public void run(){
		System.out.println("Yielding...");
		t.yield();
		for(int i=5;i>0;i--)
		{
			System.out.println(name+":"+i);

		}
		System.out.println(name+" Exiting");
	}
}
public class YieldDemo {
	
	public static void main(String args[])
	{
		//start the threads
		new MyThread3("One");
		new MyThread("Two");
	
	try
	{
		Thread.sleep(20000);
	}catch(InterruptedException ien)
	{
		System.out.println("main thread Interrupted");
	}
	System.out.println("main thread Exiting");
	}

}
