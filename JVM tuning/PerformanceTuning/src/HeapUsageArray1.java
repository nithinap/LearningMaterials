
public class HeapUsageArray1 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Creating an array of size 1000000 ...");
		
		//final int MAX_ELEMENTS = 100000000;
		
		System.gc();
		long before = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		final int MAX_ELEMENTS = 100000;
		
		 int odd_nums[] = new int[MAX_ELEMENTS];
		 int k = 1;
		 
		 System.gc();
		 long after  =Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		 
		 System.out.println("Used HeapSize:"+(after-before));
		 
		 for(int i =0;i<MAX_ELEMENTS;i++,k++)
		 {
			 odd_nums[i] = k;
			 
			 System.out.println(k+"...");
			 
			 Thread.sleep(100); //100 milliseconds
		 }
		 
		 System.out.println("Done...");
	}
}
