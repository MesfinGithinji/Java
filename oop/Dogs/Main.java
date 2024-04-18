public class Main {
	public static void main(String[] args){
		Dogs dog1 = new Dogs("Rex","Rotweiller");
		Dogs dog2 = new Dogs("Nala","Golden Retriever");

		System.out.println(dog1.getName() + " is a " + dog1.getBreed());
		System.out.println(dog2.getName() + " is a " + dog2.getBreed());
	}
}
