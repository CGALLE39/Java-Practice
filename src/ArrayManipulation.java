import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = manipulateArray(array, 2, 4, 6, 8);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Modified Array: " + Arrays.toString(newArray));

        int sum = calculateSum(newArray);
        System.out.println("Sum of Elements: " + sum);
    }

    public static int[] manipulateArray(int[] array, int removeIndex1, int removeIndex2, int addValue1, int addValue2) {
        // Create a new array with the length reduced by 2
        int[] newArray = new int[array.length - 2];

        // Copy elements before the first removal index
        for (int i = 0; i < removeIndex1; i++) {
            newArray[i] = array[i];
        }

        // Copy elements after the second removal index
        for (int i = removeIndex2 + 1; i < array.length; i++) {
            newArray[i - 2] = array[i];
        }

        // Add new values at the desired positions
        newArray[removeIndex1] = addValue1;
        newArray[removeIndex1 + 1] = addValue2;

        return newArray;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
