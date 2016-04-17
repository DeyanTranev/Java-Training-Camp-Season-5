package countcommas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReadWarAndPeace {

	static int countChars(String str) {
		int charCount = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index)==',')  {
				charCount++;
			}
		}
		return charCount;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("war_peace.txt"));
		StringBuilder sb = new StringBuilder();
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}
		
		sc.close();
		
		String novel = sb.toString();
		
	
		int commaCount =0;
		long start = System.currentTimeMillis();
		


			for (int index = 0; index < novel.length(); index++) {
				if (novel.charAt(index)==',') {
					commaCount++;
				}
			}
		
		System.out.println(commaCount);
		System.out.println("Time with one thread: " + (System.currentTimeMillis()-start+"ms"));
		
		
		long start1 = System.currentTimeMillis();
		int fifth = novel.length()/5;
		
		String novel1 = novel.substring(0, fifth);
		String novel2 = novel.substring(fifth+1, 2*fifth);
		String novel3 = novel.substring(2*fifth+1, 3*fifth);
		String novel4 = novel.substring(3*fifth+1, 4*fifth);
		String novel5 = novel.substring(4*fifth+1, novel.length());
		
		
		Thread thread1 = new Thread(() -> countChars(novel1));
		Thread thread2 = new Thread(() -> countChars(novel2));
		Thread thread3 = new Thread(() -> countChars(novel3));
		Thread thread4 = new Thread(() -> countChars(novel4));
		Thread thread5 = new Thread(() -> countChars(novel5));
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	

		while(thread1.isAlive() || thread2.isAlive() || thread3.isAlive() || thread4.isAlive() || thread5.isAlive()) {
			
		}
		System.out.println("Time with five threads: " + (System.currentTimeMillis()-start1+"ms"));
		
		long start2 = System.currentTimeMillis();
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		Thread poolThread1 = new Thread(() -> countChars(novel1));
		Thread poolThread2 = new Thread(() -> countChars(novel2));
		Thread poolThread3 = new Thread(() -> countChars(novel3));
		Thread poolThread4 = new Thread(() -> countChars(novel4));
		Thread poolThread5 = new Thread(() -> countChars(novel5));
		threadPool.submit(poolThread1);
		threadPool.submit(poolThread2);
		threadPool.submit(poolThread3);
		threadPool.submit(poolThread4);
		threadPool.submit(poolThread5);
		threadPool.shutdown();
		while (!threadPool.isTerminated()) {
			
		}
		System.out.println("Time with thread pool: "+(System.currentTimeMillis()-start2)+"ms");
	}

}
