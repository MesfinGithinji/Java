import java.io.*;
 
public class SwapVals {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         
        String[] inputValues = bufferedReader.readLine().split(" ");
        int[] arr = new int[inputValues.length];

        for (int i = 0; i < inputValues.length; i++) {
            arr[i] = Integer.parseInt(inputValues[i]);
        }
         
        for (int x=0,j=arr.length -1; x<j; x++ ,j--) {
            int temp = arr[x];
            arr[x] = arr[j];
            arr[j] = temp;
        }

        for (int k = 0; k < arr.length; k++) {
           System.out.println("arr[" + k + "]= " + arr[k]);
        }
 
    }
 
}