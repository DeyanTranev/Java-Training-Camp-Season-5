
public class StudentGroup {
	String groupSubject;
	Student[] students;
	short freePlaces;
	
	public StudentGroup() {
		// TODO Auto-generated constructor stub
		students = new Student[5];
		freePlaces=5;
		
	}
	
	public StudentGroup(String subject){
		this();
		if(subject != null) {
			this.groupSubject = subject;
		}
		else {
			this.groupSubject = "Not Assigned";
		}
	}
	
	void addStudent(Student s) {
		if(s != null && s.name != "Unknown Name") {
			if (this.freePlaces>0) {
				if (s.subject != null && s.subject.equals(this.groupSubject)) {
					students[students.length-freePlaces]=s;
					freePlaces-=1;
				}
				else {
					System.out.println("Subject mismatch");
				}
			}
			else {
				System.out.println("No more places in this group!");
			}

		}
		else {
			System.out.println("Incorrectly identified student");
		}
	}
	
	void emptyGroup() {
		if(freePlaces<5) {
			this.students = new Student[5];
			freePlaces=5;
		}
		else {
			System.out.println("This gorup is already empty.");
		}
	}
	
	String theBestStudent() {
		double maxGrade=0.0;
		String nameOfBest="";
		if (students != null && freePlaces < 5) {
			maxGrade=students[0].grade;
			for (int i = 0; i < students.length-freePlaces; i++) {
				if (students[i].grade>maxGrade) {
					maxGrade=students[i].grade;
					nameOfBest=students[i].name;
				}
			}
			return nameOfBest+" is the best.";
		}
		else {
			return("The group is not populated.");
		}
		
	}

	void printStudentsInGroup() {
		if(students != null && freePlaces<5) {
			for (int i = 0; i < students.length-freePlaces; i++) {
				System.out.println(students[i].name+" is "+students[i].age+" years old, is in year "+students[i].yearInCollege+", has "
						+students[i].grade+" grade, is studying "+students[i].subject
						+" and has "+students[i].money+" leva.");
			}
		}
		else {
			System.out.println("The group is empty");
		}
	}
}
