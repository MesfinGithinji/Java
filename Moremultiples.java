import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Moremultiples {
	public static void main (String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number ");
		int num = Integer.parseInt(bufferedReader.readLine().trim());
		
		bufferedReader.close();

		for (int i=0;i<11;i++){
			int prod = num * i;
			System.out.println(num+" x "+i+" = "+prod);
		}

	} 
}
