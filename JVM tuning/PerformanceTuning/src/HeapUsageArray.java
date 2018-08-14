
public class HeapUsageArray {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Creating an array of size 1000000 ...");
		
		//final int MAX_ELEMENTS = 100000000;
		
		final int MAX_ELEMENTS = 1000000;
		
		 int odd_nums[] = new int[MAX_ELEMENTS];
		 int k = 1;
		 
		// Get current size of heap in bytes
		 long heapSize = Runtime.getRuntime().totalMemory(); 

		 // Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
		 long heapMaxSize = Runtime.getRuntime().maxMemory();

		  // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
		 long heapFreeSize = Runtime.getRuntime().freeMemory(); 
		 
		 System.out.println("Total HeapSize:"+heapSize);
		 System.out.println("Max HeapSize:"+heapMaxSize);
		 System.out.println("Free HeapSize:"+heapFreeSize);
		 
		 for(int i =0;i<MAX_ELEMENTS;i++,k++)
		 {
			 odd_nums[i] = k;
			 
			 System.out.println(k+"...");
			 
			 Thread.sleep(100); //100 milliseconds
		 }
		 
		 System.out.println("Done...");
		 
		 Exception et = new Exception();
		 
		 
		 
		 
	}
}
