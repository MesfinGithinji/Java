import java.io.*;

public class AnotherOne{
	public static void main (String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number ");
		int num = Integer.parseInt(bufferedReader.readLine().trim());

		for (int i=0;i<11;i++){
			int prod = num * i;
			String result = num + " x " + i + " = " + prod;
			System.out.println(result);
		}


	}
}
