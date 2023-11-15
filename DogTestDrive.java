class Dog {
	String name;
	int age;

	public void bark(){
		System.out.println(name +" is barking");
	}

	public void eat(){
		System.out.println(name + " is eating");
	}
}

public class DogTestDrive{
	public static void main (String[] args){
		//Create an Array of Dog objects
		Dog[] myDogs = new Dog[3];

		myDogs[0]= new Dog();
		myDogs[1]= new Dog();
		myDogs[2]= new Dog();
		
		//use dot notation to access the name instance varible
		myDogs[0].name = "Fido";
		myDogs[0].age = 3;
		
		myDogs[1].name = "Tikki";
		myDogs[2].name = "Rexx";

		int i=0;
		while(i<myDogs.length){
			myDogs[i].bark();
		    myDogs[i].eat();
			System.out.println();	
			i++;
		}

		// for (int x=0; i < myDogs.length; x++){
		// 	System.out.println(myDogs[x]);
		// }
	}
}
