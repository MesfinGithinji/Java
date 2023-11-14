import java.io.*;

public class TrackPoints {
	public static void main (String[] args) throws IOException {
		//create our buffer to get input from stdin
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		//as for the number of players
		System.out.println("Enter Number of Players: ");
		int playerNum = Integer.parseInt(bufferedReader.readLine().trim());

		int totalservice = 0;
		int totalblocks = 0;
		int totalattacks = 0;

		int totalSucService = 0;
		int totalSucBlocks = 0;
		int totalSucAttacks = 0;

		//use a loop to add data to our arrays
		for (int i=0; i < playerNum; i++){
			System.out.println("\nEnter Player Name: ");
		        String playerName = bufferedReader.readLine();

			System.out.println("Enter service, blocks and attack attempts: ");
			String[] attemptStrings = bufferedReader.readLine().split(" ");
			int service = Integer.parseInt(attemptStrings[0]);
			int blocks = Integer.parseInt(attemptStrings[1]);
			int attacks = Integer.parseInt(attemptStrings[2]);

			System.out.println("Enter successful service, blocks and attack attempts: ");
			String[] sucStrings = bufferedReader.readLine().split(" ");
			int sucService = Integer.parseInt(sucStrings[0]);
                        int sucBlocks = Integer.parseInt(sucStrings[1]);
                        int sucAttacks = Integer.parseInt(sucStrings[2]);

			totalservice += service;
			totalblocks += blocks;
			totalattacks += attacks;

			totalSucService += sucService;
	                totalSucBlocks += sucBlocks;
        	        totalSucAttacks += sucAttacks;
		}
		double percService = ((double) totalSucService / totalservice) * 100;
                double percBlocks = ((double) totalSucBlocks / totalblocks) * 100;
                double perAttacks = ((double) totalSucAttacks / totalattacks) * 100;
		
		System.out.printf("Percentage Service: %.2f%%\n",percService);
		System.out.printf("Percentage Blocks: %.2f%%\n",percBlocks);
		System.out.printf("Percentage Attacks: %.2f%%\n",perAttacks);

	}
} 
