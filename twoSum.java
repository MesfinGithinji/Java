public class twoSum {
	public static void main(String[] args){
		//declare the array 
		int[] myarr = {1,2,4,6,8,9,14,15};

		//declare the target
		int target = 13;

		boolean result = checksum(myarr,target);

		if (result) {
			System.out.println("Two sum exists");
		} else {
			System.out.println("Two sum doesn't exist");
		}
	}

	public static boolean checksum (int[] myarr,int target) {
		int i = 0;
		int j = myarr.length -1;
		int sum ;

		while (i<j){
			sum = myarr[i] + myarr[j];
			if (sum == target) {
				return true;
			}
			if (sum > target) {
				j--;
			}
			else {
				i++;
			}
		}
		return false;
	}
}
