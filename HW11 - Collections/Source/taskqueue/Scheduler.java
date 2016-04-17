package taskqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {
	private Queue<Task> tasks = new LinkedList<Task>();
	void push(Task t) {
		this.tasks.offer(t);
	}
	
	void getWorkDone() {
		while (!this.tasks.isEmpty()) {
			this.tasks.poll().doWork();
		}
	}
}
