import java.util.*;
import java.io.*;

public class VolleyPointsTracker {
	public static void main (String[] args) throws IOException {
		//create our buffer reader
		BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));

		//get the number of players
		System.out.println("Enter Number of Players: ");
                int numPlayers = Integer.parseInt(bufferedReader.readLine().trim());

		for (int i=0; i<numPlayers; i++){
			//get the name of the players 
			System.out.println("\nEnter Player Name: ");
		        String playerName = bufferedReader.readLine();

			System.out.println("Enter service, blocks and attack attempts separeated by sapces");
			String[] attempts = bufferedReader.readLine().split(" ");
			int service = Integer.parseInt(attempts[0]);
			int blocks = Integer.parseInt(attempts[1]);
			int attacks = Integer.parseInt(attempts[2]);

			System.out.println("Enter number of successful attempts separated by spaces");
			String[] success = bufferedReader.readLine().split(" ");
			int suc1 = Integer.parseInt(success[0]);
			int suc2 = Integer.parseInt(success[1]);
			int suc3 = Integer.parseInt(success[1]);

			 //calculate the percentage of successful attempts from the total ones
                        //succesful services
                        double sucServices = ((double) suc1 / service) * 100;
                        System.out.println(sucServices);
                        // successful blocks
                        double sucBlocks = ((double) suc2 / blocks) * 100;
                        // successful attacks
                        double sucAttacks = ((double) suc3 / attacks) * 100;


                        System.out.println("Points for service: " +sucServices+ "%");
                        System.out.println("Points for Blocks: " +sucBlocks+ "%");
                        System.out.println("Points for attacks: " +sucAttacks+ "%");

		}
		
	}
}
