package hashCodeEquals; //Explanation: This line declares the package name of the class. In Java, a package is a namespace that organizes a set of related classes and interfaces. Here, the Student class belongs to the arrays package.

import java.util.Objects; // This line imports the Objects class from the java.util package. The Objects class contains utility methods for operating on objects, such as checking equality, generating hash codes, etc.

public class Student { // This line defines the Student class as a public class, meaning it can be accessed from other classes outside its package.
	
	private int id; // This line declares a private integer field id to store the student's ID. The private modifier means this field can only be accessed within the Student class.
	private String name; // This line declares a private string field name to store the student's name
	
	//Constructor
	public Student (int id, String name) { 
		this.id = id;
		this.name = name;
	}
	
	//Getters and setters (omitted for brevity)
	//HashCode method
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	//Equals method
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
		return true;
		if(obj == null || getClass() !=obj.getClass())
		return false;
		Student student = (Student) obj;
		return id == student.id && Objects.equals(name, student.name);
		
	}
	
	public static void main(String[] args) {
	
		// Creating objects of student class
		Student student1 = new Student(1, "Alice");
		Student student2 = new Student(2, "Bob");
		Student student3 = new Student(1, "Alice");
		
		// Testing equals method
		System.out.println("student.equals(student2): " + student1.equals(student2)); // Output: false
		System.out.println("student.equals(student3): " + student1.equals(student3)); // Output: true
		
		//Testing hashCode method
		System.out.println("Hashcode of student1: "+ student1.hashCode());
		System.out.println("Hashcode of student2: "+ student2.hashCode());
		System.out.println("Hashcode of student2: "+ student3.hashCode());
		
	}

}
