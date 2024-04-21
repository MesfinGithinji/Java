import java.io.*;
import java.util.*;

public class Collections {
	public static void main(String[] args){
		
		//ArrayList declaration and initialization
		ArrayList<Integer> mylist = new ArrayList<Integer>();

		//adding elements into the list using a for loop
		for(int i=0; i<10; i++){
			mylist.add(i);
		}

		//printing all elements in the arraylist 
		System.out.println(mylist);

		//printing the list one by one
		for(int x=0; x < mylist.size(); x++) {
			System.out.println(mylist.get(x) + " ");
		}
	}
}
