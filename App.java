class Person {
	// Class is used to create objects
	// What are objects? Objects are EVERYTHING. Your cat, your desk, your
	// computer, etc. Same thing in coding
	// Person class can be created to create person objects. The class is to
	// represent particular people
	// Class is also like a type (int, double, string)

	// Instance variables (data or "state")
	
	String name;
	int age;

	// Classes can contain the following:
	// 1. Data (age, location, mood, heart rate, etc)
	// 2. Subroutines (methods) - Tutorial 18 - Allows you to give an object behavior (walking, running, talking, etc)
	
	void speak()	{    // This is a method
		System.out.println("My name is: " + name + " and I am " + age + " years old");
	}
	
	void sayHello()	{
		System.out.println("Hello there");
	}
	
}

class Animal {

	String animal;
	String breed;

}

class Insects	{
	String insect;
	int insectNumb;
}

public class App {

	public static void main(String[] args) {

		Person person1 = new Person(); // Declaring variable of type Person.
										// Here you are creating a new person

		person1.name = " Matt Rein";
		person1.age = 30;
		person1.speak();
		person1.sayHello();

		Person person2 = new Person();

		person2.name = "Sarah Smith";
		person2.age = 20;
		person2.speak();
		person1.sayHello();
		
		Animal animal1 = new Animal();

		animal1.animal = "dog";
		animal1.breed = "German Shepard";
		
		Insects insect1 = new Insects();
		Insects insect2 = new Insects();
		
		insect1.insect = "Bee";
		insect1.insectNumb = 4321;	
		
		
		

	}

}
