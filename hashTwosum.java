import java.util.HashMap;
import java.util.Map;

public class hashTwosum {

  public static int[] twosum(int[] numbers, int target){
    Map<Integer,Integer> numMap =  new HashMap<>();

    for (int i=0; i<numbers.length; i++){
      int complement = target - numbers[i];

      if (numMap.containsKey(complement)){
        return new int[]{numMap.get(complement),i};
      }
      numMap.put(numbers[i],i);
    }

    throw new IllegalArgumentException("Numbers not found");
  }

  public static void main(String[] args){
    int[] numbers = {2,7,11,15};
    int target = 18;

    int[] result = twosum(numbers,target);
    System.out.println("The index positions of the two values are:"+ result[0]+", " + result[1]);
  }
}
