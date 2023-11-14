import java.util.Scanner;

public class VolleyBall {
	public static void main (String[] args){
		//first get the number of player
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Players: ");
		int playerNum = scanner.nextInt();

		System.out.println("Enter service, blocks and attack attempts separeated by sapces");
		int service = scanner.nextInt();
		int blocks = scanner.nextInt();
		int attack = scanner.nextInt();

		int[] attempts = new int[3];
		attempts[0] = service;
		attempts[1] = blocks;
		attempts[2] = attack;

		System.out.println("Enter number of successful attempts separated by spaces");
		int suc1 = scanner.nextInt();
		int suc2 = scanner.nextInt();
		int suc3 = scanner.nextInt();

		int[] success = new int[3];
		success[0] = suc1;
		success[1] = suc2;
		success[2] = suc3;
		 

		//calculate the percentage of successful attempts
		//succesful services 
		double sucServices =((double) success[0] / attempts[0]) * 100;
		System.out.println(sucServices);
		//succesful blocks
		double sucBlocks =((double) success[1] / attempts[1]) * 100;
		//succesful attacks
		double sucAttacks =((double) success[2] / attempts[2]) * 100;

		System.out.println("Points for service: " +sucServices+ "%");
		System.out.println("Points for Blocks: " +sucBlocks+ "%");
		System.out.println("Points for attacks: " +sucAttacks+ "%");

	}
}
