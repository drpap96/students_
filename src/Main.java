
public class Main {

	public static void main(String[] args) {
		
		Student s1= new Student("John","dai15093");
		Student s2= new Student("John","dai15013");
		
		if(s1.equals(s2)) {
			System.out.println("Its the same student");
		}else {
			System.out.println("These guys are different");
		}
		

	}

	

}
