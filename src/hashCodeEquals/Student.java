// 

package hashCodeEquals; //Explanation: This line declares the package name of the class. In Java, a package is a namespace that organizes a set of related classes and interfaces. Here, the Student class belongs to the arrays package.

import java.util.Objects; // This line imports the Objects class from the java.util package. The Objects class contains utility methods for operating on objects, such as checking equality, generating hash codes, etc.

public class Student { // This line defines the Student class as a public class, meaning it can be accessed from other classes outside its package.
	
	private int id; // This line declares a private integer field id to store the student's ID. The private modifier means this field can only be accessed within the Student class.
	private String name; // This line declares a private string field name to store the student's name
	
	//Constructor
	public Student (int id, String name) { // This is the constructor of the Student class. It is used to initialize objects of the Student class with specific values for id and name.
		this.id = id; // Inside the constructor, this line assigns the parameter id to the instance variable id. The this keyword is used to refer to the current object's instance variables.
		this.name = name; // Similarly, this line assigns the parameter name to the instance variable name.
	}
	
	// This is a comment indicating that getter and setter methods, which are typically used to access and modify the private fields, are not shown here to keep the code concise.

	@Override // This annotation indicates that the method below it is overriding a method from the superclass. In this case, the hashCode() and equals(Object obj) methods are overriding the default implementations from the Object class.
	public int hashCode() {  // This method returns a hash code for the Student object. A hash code is a numeric value used to uniquely identify an object during hashing operations, such as in hash tables.
		return Objects.hash(id, name); // This line generates a hash code by combining the hash codes of id and name. The Objects.hash() method helps ensure that equal objects have the same hash code, which is important for the consistent behavior of hash-based collections like HashSet and HashMap.
	}
	
	//Equals method
	@Override 
	public boolean equals(Object obj) { // This method checks if two Student objects are considered equal. It's crucial when comparing objects to determine if they represent the same data.
		if(this == obj) // This line checks if the current object (this) is the same as the object passed in (obj). If they are the same object in memory, they are definitely equal, so it returns true.
		return true; 
		if(obj == null || getClass() !=obj.getClass())
		return false;
		Student student = (Student) obj; // This line casts the obj parameter to a Student type. Since the previous check confirmed they are the same class, this casting is safe.
		return id == student.id && Objects.equals(name, student.name); // This line compares the id and name fields of the current Student object with those of the passed-in student object. If both fields are equal, the method returns true, meaning the two objects are considered equal.
		
	}
	
	public static void main(String[] args) {
	
		// Creating objects of student class
		Student student1 = new Student(1, "Alice"); // This line creates a new Student object with id 1 and name "Alice" and assigns it to the student1 variable.
		Student student2 = new Student(2, "Bob"); // 
		Student student3 = new Student(1, "Alice");
		
		// This line tests whether student1 is equal to student2 by calling the equals method. Since their id and name are different, it returns false.
		// Testing equals method
		System.out.println("student.equals(student2): " + student1.equals(student2)); // Output: false
		System.out.println("student.equals(student3): " + student1.equals(student3)); // Output: true
				
		//Testing hashCode method
		System.out.println("Hashcode of student1: "+ student1.hashCode());
		System.out.println("Hashcode of student2: "+ student2.hashCode());
		System.out.println("Hashcode of student2: "+ student3.hashCode());
		
	}

}

/*
 * 
 * Use Cases of This Code: Equality Comparison: The equals method is useful for
 * comparing two Student objects to see if they represent the same entity based
 * on id and name. Hash-Based Collections: The hashCode method is essential for
 * storing Student objects in collections like HashMap or HashSet, where the
 * hash code determines the object's location in the collection. Example
 * Scenario: Consider a school management system where you need to ensure that
 * each student is uniquely identified by their id and name. You could use this
 * Student class to manage students and check for duplicates or store them in a
 * HashMap with their id as the key.
 */

