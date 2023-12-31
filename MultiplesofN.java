import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class MultiplesofN {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number you wish to display its multiples");
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for (int i=1; i<11; i++){
            int prod = N * i;
            System.out.println(N + " x " + i + " = " + prod);
        }
    }
}

