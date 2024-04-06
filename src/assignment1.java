import java.util.Scanner;

public class assignment1 {
    /**
     * Calculates the average of numbers in the given array.
     *
     * @param № The array containing numbers to calculate the average from.
     * @return The average of numbers in the array.
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

        double average = findAverage(arr);
        System.out.println("Average: " + average);

        scanner.close();
    }

    public static double findAverage(int[] arr) {      // Function to find the min element

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}



