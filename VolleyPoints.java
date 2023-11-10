import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VolleyPoints {
    public static void main(String[] args) throws IOException {
        // create our buffer reader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // get the number of players
        System.out.println("Enter Number of Players: ");
        int numPlayers = Integer.parseInt(bufferedReader.readLine().trim());

        int totalServices = 0, totalBlocks = 0, totalAttacks = 0;
        int totalSuccessfulServices = 0, totalSuccessfulBlocks = 0, totalSuccessfulAttacks = 0;

        for (int i = 0; i < numPlayers; i++) {
            // get the name of the player
            System.out.println("Enter Player Name: ");
            String playerName = bufferedReader.readLine();

            // get the attempts and successful attempts
            System.out.println("Enter service, blocks and attack attempts separated by spaces");
            String[] attemptStrings = bufferedReader.readLine().split(" ");
            int service = Integer.parseInt(attemptStrings[0]);
            int blocks = Integer.parseInt(attemptStrings[1]);
            int attacks = Integer.parseInt(attemptStrings[2]);

            System.out.println("Enter number of successful attempts separated by spaces");
            String[] successStrings = bufferedReader.readLine().split(" ");
            int suc1 = Integer.parseInt(successStrings[0]);
            int suc2 = Integer.parseInt(successStrings[1]);
            int suc3 = Integer.parseInt(successStrings[2]);

            // update the totals
            totalServices += service;
            totalBlocks += blocks;
            totalAttacks += attacks;

            totalSuccessfulServices += suc1;
            totalSuccessfulBlocks += suc2;
            totalSuccessfulAttacks += suc3;
        }

        // calculate the percentages
        double sucServices = ((double) totalSuccessfulServices / totalServices) * 100;
        double sucBlocks = ((double) totalSuccessfulBlocks / totalBlocks) * 100;
        double sucAttacks = ((double) totalSuccessfulAttacks / totalAttacks) * 100;

        // display the results
        System.out.printf("Total Percentage of Successful Services: %.2f%%\n", sucServices);
        System.out.printf("Total Percentage of Successful Blocks: %.2f%%\n", sucBlocks);
        System.out.printf("Total Percentage of Successful Attacks: %.2f%%\n", sucAttacks);
    }
}
