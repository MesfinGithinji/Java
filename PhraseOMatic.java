import java.util.Random;

public class PhraseOMatic {
	public static void main (String[] args) {
		String[] wordListOne = {"agnostic", "opinionated","voice activated", "haptically driven", "extensible","reactive",
					"agent based", "functional", "AI enabled","strongly typed"};
		
		String[] wordListTwo = {"loosely coupled", "six sigma","asynchronous", "event driven", "pub-sub", "IoT", 
			"cloud native", "service oriented", "containerized", "serverless","microservices", "distributed ledger"};
		
		String[] wordListThree = {"framework", "library","DSL", "REST API", "repository", "pipeline", "service mesh", 
					"architecture", "perspective", "design","orientation"};
		
		//lets find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// generate three random numbers
		Random randomGenerator = new Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);

		// now build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		// print out the phrase
		System.out.println("What we need is a " + phrase);

	}//end main
}//end 
