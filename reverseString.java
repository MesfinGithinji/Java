public class reverseString {
	public static void main(String[] args){
		//string to be reversed
		String word = "Hello World";

		//use the stringBuilder 
		StringBuilder builder = new StringBuilder(word);

		//convert stringbuilder back to string
		String reversed = builder.reverse().toString();

		System.out.println(reversed);
	}
}
