package taskqueue;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scheduler scheduler1 = new Scheduler();
		Coding c1 = new Coding();
		Driving d1 = new Driving();
		Teaching t1 = new Teaching();
		Building b1 = new Building();
		scheduler1.push(c1);
		scheduler1.push(d1);
		scheduler1.push(t1);
		scheduler1.push(b1);
		scheduler1.getWorkDone();
	}

}
