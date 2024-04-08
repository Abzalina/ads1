import  java.util.List;
public class Problems {

    public static int problem_1(int n, List<Integer> l1){
        /**
         * Finds the minimum element in the given array.
         *
         * @param №arr The array to find the minimum element from.
         * @return The minimum element in the array.
         */
        int min = 999999999;
        for (int i = 1; i < n; i++) {
            if (l1.get(i) < min) {
                min = l1.get(i);
            }
        }
        return min;

    }

    public static double problem_2(int n, List<Integer> l2) {
        /**
         * Calculates the average of numbers in the array.
         *
         * @param № The array containing numbers to calculate the average from.
         * @return The average of numbers in the array.
         */
        double average = 0;

        for(int i = 0; i < n; i++){
            average += l2.get(i);
        }

        return average/n;
    }

    public static String problem_3(int n, int i){
        /**
         * checking the numbers for prime .
         *
         * @param n The number to be checked.
         * @return True if the number is prime, false if the number is composite.
         */
        String output1 = "Prime";
        String output2 = "Composite";

        if(n == 0 || n == 1) return output2;

        if(n==i) return output1;

        if (n % i == 0) return output2;

        i++;

        return problem_3(n, i);
    }
    public static int problem_4(int n){

        if (n == 0) return 1;

        return n * problem_4(n-1);
    }
    public static int problem_5(int n){
        if (n == 1 || n == 2) return 1;

        return problem_5(n-1) + problem_5(n-2);
    }
    public static int problem_6(int a, int n, int s){
        if (n == 1) return a;
        return problem_6(a*s, n - 1, s);
    }

    public static int[] problem_7(int n, int[] l1, int[] res, int i){
        if(n == 0) return res;
        res[i] = l1[n-1];
        return problem_7(n - 1, l1, res, i + 1);
    }

    public static String problem_8(String a, int i){

        if (i >= a.length()) return "Yes";

        if (Character.isDigit(a.charAt(i))) {
            return problem_8(a, i + 1);
        } else {
            return "No";
        }
    }

    public static int problem_9(int n, int k){
        if(k == 0 || k == n) return 1;

        return problem_9(n-1, k-1) + problem_9(n - 1, k);
    }

    public static int problem_10(int n, int k){
        if (k == 0){
            return n;
        }

        return problem_10(k, n % k);
    }
}
