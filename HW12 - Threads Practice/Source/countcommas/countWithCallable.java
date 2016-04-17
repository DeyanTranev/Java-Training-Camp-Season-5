package countcommas;

import java.util.concurrent.Callable;

public class countWithCallable implements Callable<Integer>{

	private String forCounting;
	public countWithCallable(String str) {
		this.forCounting=str;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Integer call() throws Exception {
		int charCount = 0;
		for (int index = 0; index < forCounting.length(); index++) {
			if (forCounting.charAt(index)==',')  {
				charCount++;
			}
		}
		return charCount;
		
	}

}
