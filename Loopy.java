class Loopy{
	
	public static void main(String[] args){
		int x = 1;
		System.out.println("Before the Loop x is: "+x);

		while(x<4){
			System.out.println("In the loop");
			x = x+1;
			System.out.println("X is now: "+x);
		}
		System.out.println("After the Loop x is now: " +x);
	}
}
