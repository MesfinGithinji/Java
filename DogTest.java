class Dog{
	//instance variables(what we know)
	int age;
	String breed;
	String name;
	String gender;

	void bark(){
		System.out.println("I am barking");
	}
}

class DogTest{
	public static void main(String[] args){
		//create a new 'dog' object/instance of the dog class
		Dog d1 = new Dog();

		//set some instance variables for d1
		d1.breed = "German Shepherd";
		d1.name = "Rex";
		d1.gender = "Male";
		d1.age = 4;

		//output code
		System.out.println("Name: "+ d1.name + "\nBreed: "+ d1.breed + "\nGender: "+ d1.gender + "\nAge: "+d1.age);
		d1.bark();
	}
}

