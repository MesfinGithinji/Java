import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int myArr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int newArr[] = new int[myArr.length]; // Create a new array to store reversed elements

        for (int i = myArr.length - 1, j = 0; i >= 0; i--, j++) {
            newArr[j] = myArr[i]; // Copy elements from original array to new array in reverse order
        }

        System.out.println("Original array: " + Arrays.toString(myArr));
        System.out.println("Reversed array: " + Arrays.toString(newArr));
    }
}

