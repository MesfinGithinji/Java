import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest{
	public static void main (String[] args){

		//static Array(memory size allocation is fixed) , Dynamic Array(changes based on input)i
	
		int[] myArr;
		myArr = new int[5];
		
		//to add data in a static Array you make use of index positions 
		myArr[0]= 120;
		myArr[1]= 39;
		myArr[2]= 50;
		myArr[3]= 2;
		myArr[4]= 3456; 

		//Dynamic Arrays- ArraysLists
		ArrayList<String> myArrList = new ArrayList<>(Arrays.asList("John","Mark","John","Luke","Mathew"));
		System.out.println(myArrList.remove("John"));		
		System.out.println(myArrList);
	} 
		
}
