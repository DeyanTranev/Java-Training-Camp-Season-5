package Problem1;

public class Activate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ivan = new Person("Ivan Aleksiev", 25, true);
		Person antonia = new Person("Antonia Daskalova", 27, false);
		Student hristo = new Student("Hristo Dimitrov", 20, true, 5.60);
		Student hristina = new Student("Hristina Tsacheva", 21, false, 5.5);
		Employee dobri = new Employee("Dobri Iskrov", 23, true, 80);
		Employee stefania = new Employee("Stefania Apostolova", 23, false, 90);
		
		Person[] people = new Person[10];
		//int slots = people.length;
		people[0] = ivan;
		people[1]= antonia;
		people[2]= hristo;
		people[3]=hristina;
		people[4]=dobri;
		people[5]=stefania;
		
		//System.out.println(dobri.getClass().toString());
		
//		if(hristo.getClass().toString().endsWith("Student")) {
//			System.out.println("Hristo is a student.");
//		}
		
		for (int i = 0; i < people.length; i++) {
			if (people[i] != null) {
				if ((people[i].getClass().toString().endsWith("Person"))) {
					people[i].showPersonInfo();
				}
				if(people[i].getClass().toString().endsWith("Student")) {
					((Student) people[i]).showStudentInfo();
				}
				if(people[i].getClass().toString().endsWith("Employee")) {
					((Employee) people[i]).showEmployeeInfo();
				}
			}
		}
		
		for (int i = 0; i < people.length; i++) {
			if(people[i] != null && people[i].getClass().toString().endsWith("Employee")) {
				System.out.println("Overtime pay for "+people[i].getName()+": "+((Employee) people[i]).calculateOvertime(2)+"for two hours");
			}
		}
		
	}
	
	/* Moje da se syzdade constructor Student bez parametri, pri uslovie che v tqloto mu se izpolzva super referenciq, 
	 * koqto da inicializira name, age i isMale, naprimer super("default name", 20, false)
	 */
	


}
