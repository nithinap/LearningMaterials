import java.io.*;

public class HeapDumper {
	public static void main(String[] args) throws Exception{
		int n = 10;
		
		//for(;;)
		{
			
			Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec("jps");
			BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			
			String str;
			
			while((str = br.readLine())!=null)
			{
				System.out.println(str);
			}
			
			rt.exec("jmap -dump:live,file=D:/test.bin 1552");
			
			Thread.sleep(120000);
		}
	}
}
