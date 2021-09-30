
public class Student {
	private String name;
	private String id;
	
//Constructor
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void printInfo() {
	System.out.println("Name: "+name);
	System.out.println("Id: "+id);
	}
@Override	//≈–… ¡À’ÿ« ‘«” toString
	public String toString() {
		return ("Student name is: "+ name+ "\n"+"With id:"+ id);
		
	}

@Override //≈–… ¡À’ÿ« ‘«” equals
public boolean equals(Object obj) {
	Student otherStudent=(Student)obj;
	
	if(this.name.equals(otherStudent.name)&& this.id.equals(otherStudent.id))
		return true;
	else
		return false;
	
}

}
