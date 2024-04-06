import java.util.Scanner;

public class problem1 {
    /**
     * Finds the minimum element in the given array.
     *
     * @param №arr The array to find the minimum element from.
     * @return The minimum element in the array.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];     // Create an array of size n

        System.out.println("Enter the elements for array:");    // Read the elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = findMinimum(arr);
        System.out.println("Minimum element: " + min);

        scanner.close();
    }

    public static int findMinimum(int[] arr) {      // Function to find the min element

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}



