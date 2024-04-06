import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner();
        int n = sc.nextInt(n);
        int res = sumFirstel(array, n);
        System.out.println(res);
    }
    public static int sumFirstel(int[] array, int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return array[n - 1] + sumFirstel(array, n - 1);
        }
    }
}