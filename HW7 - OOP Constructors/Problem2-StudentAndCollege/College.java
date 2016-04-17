
public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ivan = new Student("Ivan Petrov", "Computer Science");
		ivan.grade=5.5;
		ivan.yearInCollege=2;
		ivan.money=500;
		ivan.age=19;
		
		Student teodor = new Student("Teodor Alexiev", "Computer Science");
		teodor.grade=5.25;
		teodor.yearInCollege=3;
		teodor.money=300;
		teodor.age=20;
		
		Student irina = new Student("Irina Paraskelova", "Computer Science");
		irina.grade = 5.65;
		irina.money=400;
		irina.age=18;
		
		Student vasilena = new Student ("Vasilena Kremenlieva", "Computer Science");
		vasilena.grade = 5.0;
		vasilena.money=1000;
		vasilena.age=18;
		
		Student trifon = new Student("Trifon Stoimenov", "Computer Science");
		trifon.grade = 5.70;
		trifon.yearInCollege=3;
		trifon.money = 800;
		trifon.age=21;
		
		Student alexander = new Student ("Alexander Dobrikov", "Finance");
		alexander.grade = 4.75;
		alexander.yearInCollege = 2;
		alexander.money = 600;
		alexander.age = 20;
		
		Student mirela = new Student ("Mirela Kostadinova", "Finance");
		mirela.grade = 5.5;
		mirela.yearInCollege=1;
		mirela.money=100;
		mirela.age=19;
		
		Student velizar = new Student("Velizar Stoyanov", "Finance");
		velizar.grade = 6.0;
		velizar.yearInCollege = 3;
		velizar.money = 500;
		velizar.age = 22;
		
		Student antoaneta = new Student("Antoaneta Borisova", "Finance");
		antoaneta.grade = 5.30;
		antoaneta.yearInCollege = 2;
		antoaneta.money = 750;
		antoaneta.age = 19;
		
		irina.upYear();
		System.out.println("Irina is in year "+irina.yearInCollege+" of college.");
		
		vasilena.receiveScholarship(5.0, 350);
		System.out.println(vasilena.money);
		
		StudentGroup cs1 = new StudentGroup("Computer Science");
		cs1.addStudent(ivan);
		cs1.addStudent(teodor);
		cs1.addStudent(irina);
		cs1.addStudent(vasilena);
		cs1.addStudent(trifon);
		teodor.upYear();
		System.out.println(teodor.isDegree);
		
		cs1.addStudent(velizar);
		
		cs1.printStudentsInGroup();
		System.out.println(cs1.theBestStudent());
		
		cs1.emptyGroup();
		cs1.printStudentsInGroup();
		
		StudentGroup fin1 = new StudentGroup("Finance");
		
		fin1.addStudent(alexander);
		fin1.addStudent(mirela);
		fin1.addStudent(velizar);
		fin1.addStudent(antoaneta);
		
		fin1.printStudentsInGroup();
			
		
	}
	

}
