package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Sinan");
		student.setLastName("Kara");
		student.setAge("25");
		student.setSchool("ABC School");
		student.setStudentNumber("12345");
		student.setEmail("snan@gmail.com");
		
		StudentManager studentManager = new StudentManager();		
		studentManager.add(student);
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setAge("30");
		instructor.setAdress("Abc Adress");
		instructor.setEmail("engin@gmail.com");
		instructor.setNationalIdentity("123456");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
	}

}
