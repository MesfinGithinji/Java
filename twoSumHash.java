import java.util.HashMap;
import java.util.Map;

public class twoSumHash {

    public static int[] twoSum(int[] nums, int target) {
	//instantiate a hashmap
        Map<Integer, Integer> numIndices = new HashMap<>();
	
	//iterate through the array using the for loop
        for (int i = 0; i < nums.length; i++) {
	    //calculate the complement per index by subtracting the current element from the target
            int complement = target - nums[i];

	    /*
	     * check if the complement is already inside our hashmap
	     * if it is then return a new array which contains two indexes
	     * numIndices.get(complement) return the index of the complement because the complement ist the key and the value is the index
	     * i is the index of the current element we are looking at in the array 
	     * */
            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i};
            }

            numIndices.put(nums[i], i);
        }

        // No solution found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] myarr = {12, 23, 34, 45, 56, 78, 89, 96};
        int target = 112;

        int[] result = twoSum(myarr, target);

        if (result[0] != -1) {
            System.out.printf("Two numbers that add up to %d are at indexes %d and %d%n", target, result[0], result[1]);
        } else {
            System.out.println("Two numbers not found");
        }
    }
}

