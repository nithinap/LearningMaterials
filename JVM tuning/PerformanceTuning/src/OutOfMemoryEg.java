import java.lang.ref.SoftReference;

class MTest{
	int arr[];
	
	MTest()
	{
		arr = new int[10000000];
		System.out.println("Constructing...");
	}
	
/*	public void finalize()
	{
		System.out.println("Finalizing...");
	}
	*/
}

public class OutOfMemoryEg {
	public static void main(String[] args) {
		
		int i=0;
				Object mto[]= new Object[10000];
/*		for(;;)
		{
			System.out.println(i);
			mto[i++] = new MTest(); 
		}*/

		
		SoftReference<MTest> srm;
		for(;;)
		{
			System.out.println(i);
			srm= new SoftReference<MTest>(new MTest()); 
			mto[i++] = srm;
		}
	}
}
