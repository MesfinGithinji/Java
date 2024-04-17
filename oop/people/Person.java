public class Person {
    // BluePrint for creating objects representing people
    
    // Private instance variables
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //getter method for name	
    public String getName() {
        return name;
    }
    
    //getter method for age
    public int getAge() {
        return age;
    }
}
