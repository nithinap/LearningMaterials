class MyThread8 extends Thread{
	static int i = 0;
	Object obj1, obj2;
	
	MyThread8(Object obja, Object objb, String thread_name)
	{
		obj1 = obja;
		obj2 = objb;
		
		//set the name of thread
		setName(thread_name);
	}
	
	public void run(){
        while(true){
            synchronized(obj1){
                synchronized(obj2){
                	i++;
                    System.out.println(obj1+"  "+obj2+" iteration no."+i);
                }
            }
        }
    }
}

public class ThreadDeadLock0 {
     
    public static void main(String a[]){
        String str1 = "first string";
        String str2 = "second string";
        
    	MyThread8 t1 = new MyThread8(str1,str2, "First Thread");
    	
    	//DeadLock occurs
    	MyThread8 t2 = new MyThread8(str2,str1, "Second Thread");
    	//MyThread8 t2 = new MyThread8(str1,str2, "Second Thread");
    	
    	t1.start();
    	t2.start();
    }
}
