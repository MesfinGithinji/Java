public class palindrome {
	public static void main(String[] args){
		//decalre our palindrome
		String palindrome = "No lemon,no melon";
		
		//get its length
		int len = palindrome.length();

		/*
		 * We need to divide up our palindrome from a sequence of Strings
		 * To an Array of characters. 
		 * So we need a temporary array to allow us to loop through each 
		 * character of the palindrome on its own.
		 * This array has to be the same size as our palindrome
		 * */
		char[] tempArr = new char[len];

		/*
		 * We also need another array that will host our reversed String
		 * */
		char[] reverseArr = new char[len];

		/*
		 * next we loop through each character in the palindrome string and append 
		 * each character into our temp array
		 * We will use a method called charAt(i)
		 * charAt(i), returns the ith character in the string, counting from 0.
		 * */
		for(int i=0; i < len; i++){
			tempArr[i] = palindrome.charAt(i);
		} 

		/*
		 * Next lets reverse the array 
		 * */
		for(int j=0; j < len; j++){
			reverseArr[j] = tempArr[len-1-j];
		}

		String reversedPalindrome = new String(reverseArr);
		System.out.println(reversedPalindrome);
	}
}
