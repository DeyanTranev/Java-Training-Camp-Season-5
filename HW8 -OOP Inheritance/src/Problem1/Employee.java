package Problem1;

public class Employee extends Person {
	private double daySalary;
	
	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if(daySalary > 0.0) {
			this.daySalary = daySalary;
		}
	}

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}
	
	public void showEmployeeInfo() {
		if (this.isMale()) {
			System.out.println("This is "+this.getName()+", he is "+this.getAge()+" years old and his daily salary is "+ this.getDaySalary());
		}
		else {
			System.out.println("This is "+this.getName()+", she is "+this.getAge()+" years old and her daily salary is "+ this.getDaySalary());
		}
	}
	
	public double calculateOvertime(double hours) {
		if (this.getAge() >= 18) {
			return (getDaySalary()/8)*hours;
		}
		else {
			return 0.0;
		}
	}
}
