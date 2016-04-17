
public class Student {
	String name;
	String subject;
	double grade;
	byte yearInCollege;
	boolean isDegree;
	double money;
	byte age;
	
	public Student() {
		// TODO Auto-generated constructor stub
		this.grade = 4.0;
		this.yearInCollege=1;
		this.isDegree=false;
		this.money = 0;
		this.age=18;
	}
	public Student(String name, String subject) {
		this();
		if(name != null) {
			this.name = name;
		}
		else {
			this.name = "Unknown Name";
		}
		if(subject != null) {
			this.subject = subject;
		}
		else {
			this.subject = "Undecided";
		}
	}
	
	void upYear() {
		if (this.yearInCollege == 4) {
			System.out.println("This is the student's last year in college!");
		}
		if (this.yearInCollege == 3) {
			this.yearInCollege++;
			this.isDegree=true;
		}
		if (this.yearInCollege>0 && this.yearInCollege<=2) {
			this.yearInCollege++;
		}
	}
	
	double receiveScholarship(double min, double amount) {
		if (min>=5.0 && min <=6.0 && amount>=100) {
			if(this.grade>=min && this.age<30) {
				this.money+=amount;
			}
		} 
		else {
			System.out.println("Incorrect parameters - Scholarships are only awarded "
					+ "for grades higher than 5.0 and the maximum grade is 6.0. A scholarship is at least 100 leva. ");
		}
		return this.money;
	}
	
}
