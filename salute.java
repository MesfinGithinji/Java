import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class saluter{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name: ");

		String first_name = reader.readLine();

		System.out.println("Hello " + first_name + ".Nice to meet You.");

		reader.close();

	}
}
