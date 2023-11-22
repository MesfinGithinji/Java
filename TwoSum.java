public class TwoSum {
	
	boolean checksum (int[] arr , int target) {
		for (int i=0; i < arr.length; i++) {
			for (int j=i+1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum == target){
					return true;
				}
			}
		}
		return false;
	}

	public static void main (String[] args) {
		//declare the array
                int[] arr = {11,22,33,44,55,66,77,88,99,100};

                //declare the target
                int target = 132;

		TwoSum twosum = new TwoSum();

                boolean result = twosum.checksum(arr,target);

                if (result) {
                        System.out.println("Numbers found");
                } else {
                        System.out.println("Numbers not found");
                }

        }
	
}
