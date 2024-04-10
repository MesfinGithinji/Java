import java.io.File; //import the file class
import java.io.FileNotFoundException; //import this class to handle errors
import java.util.Scanner; //import the scanner class to read text files

public class CheckFile {
  public static void main(String[] args) {
    try {
      readFile("test1.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    // Read and process the contents of the file
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
    }

    scanner.close();
  }
}

