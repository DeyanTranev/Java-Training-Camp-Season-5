package Problem1;

public class Person {
	private String name;
	private int age;
	private boolean isMale;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.equals("")) {
			this.name = name;
		}
		else {
			this.name = "Default name";
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>0) {
		this.age = age;
		}
		else {
			this.age=0;
		}
	}
	public boolean isMale() {
		return isMale;
	}
	public void setGender(boolean isMale) {
		this.isMale = isMale;
	}
	
	public Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		setGender(isMale);
	}
	
	public void showPersonInfo() {
		if(this.isMale) {
			System.out.println("This is "+this.name+", he is "+this.age+" years old ");
		}
		else {
			System.out.println("This is "+this.name+", she is "+this.age+" years old ");
		}
	}
}


