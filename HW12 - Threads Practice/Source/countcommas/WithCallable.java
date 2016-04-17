package countcommas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WithCallable {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException, ExecutionException {
		Scanner sc = new Scanner(new File("war_peace.txt"));
		StringBuilder sb = new StringBuilder();
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}
		
		sc.close();
		long start = System.currentTimeMillis();
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		List<Future<Integer>> counts =  new ArrayList<Future<Integer>>();
		for (int split = 0; split < 5; split++) {
			counts.add(threadPool.submit(new countWithCallable(sb.substring(split*sb.length()/5, (split+1)*sb.length()/5))));
		}
		threadPool.shutdown();
		int commas = 0;
		for (Future<Integer> count: counts) {
			commas += count.get();
		}
		System.out.println(System.currentTimeMillis()-start+"ms");
		System.out.println(commas);

	}

}
