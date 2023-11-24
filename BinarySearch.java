public class BinarySearch {
      static int binarySearch (int[] array, int target){
        int left = 0, right = array.length -1;
        
        while(left <= right) {
          //calculate mid point
          int mid = left + (right - left) / 2;

          //check if the value we are looking for is at the middle
          if (array[mid] == target){
            return mid;
          }

          //check if our target is greater than the mid if it is then ignore the left half
          if (array[mid] < target){
            left = mid + 1;
          } else {
            right = mid - 1;
          }

        }
        return -1;//target is not present
      }

      public static void main (String[] args) {
        int[] sortedArray = {2,5,8,23,35,45,60,78,89};
        int target = 60;
        
        int result = binarySearch(sortedArray , target);

        if (result == -1){
          System.out.println("Element not found");
        } else {
          System.out.println("Element found at index " + result);
        }
      }
}
