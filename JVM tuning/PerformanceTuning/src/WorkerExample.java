import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class WorkerExample implements Runnable {
	public boolean running = false;

	Map<String, ArrayList<String>> hm = new ConcurrentHashMap<String, ArrayList<String>>();

	public WorkerExample() {
		Thread thread = new Thread(this);
		thread.start();
	}

	public static void main(String[] args) throws InterruptedException {
		List<WorkerExample> workers = new ArrayList<WorkerExample>();

		//System.out.println(
		//		"This is currently running on the main thread, " + "the id is: " + Thread.currentThread().getId());

		Date start = new Date();

		// start 35 workers
		for (int i = 0; i < 100; i++) {
			workers.add(new WorkerExample());
		}

		// We must force the main thread to wait for all the workers
		// to finish their work before we check to see how long it
		// took to complete
		for (WorkerExample worker : workers) {
			while (worker.running) {
				Thread.sleep(200);
			}
		}

		Date end = new Date();

		long difference = end.getTime() - start.getTime();

		System.out.println("This whole process took: " + difference / 1000 + " seconds.");

		System.out.println("Printing information related to all Threads");
	}

	@Override
	public void run() {
		this.running = true;
//		System.out.println(
//				"This is currently running on a separate thread, " + "the id is: " + Thread.currentThread().getId());

		try {

			// create an ArrayList
			ArrayList<String> als = new ArrayList<String>();
			for (int i = 0; i < 1000; i++) {
				als.add(generateRandomString(100) + i);
			}

			for (int i = 0; i < 200; i++) {
				String str = generateRandomString(100);
//				System.out.println(Thread.currentThread().getName() + ":" + str + ":" + i);

				hm.put(Thread.currentThread().getName() + ":" + i, als);

				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		this.running = false;
	}

	public static String generateRandomString(int length) {
		Random rnd = new Random();
		char[] values = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		String out = "";

		for (int i = 0; i < length; i++) {
			int idx = rnd.nextInt(values.length);
			out += values[idx];
		}
		return out;
	}

	public static void specialPrint(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(250);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}