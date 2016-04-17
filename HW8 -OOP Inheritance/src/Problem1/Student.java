package Problem1;

public class Student extends Person{

	private double score;
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		if (score >=2.0 && score<=6.0) {
			this.score= score;
		} 
		else {
			this.score = 3.0;
		}
	}
	
	
	public Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		this.setScore(score);
	}
	public void showStudentInfo() {
		if(this.isMale()) {
			System.out.println("This is "+this.getName()+", he is "+this.getAge()+" years old and his score is "+ this.getScore());
		}
		else {
			System.out.println("This is "+this.getName()+", she is "+this.getAge()+" years old and her score is "+ this.getScore());
		}
	}
}
