import  java.util.List;
public class Problems {

    public static int problem_1(int n, List<Integer> l1){
        int min = 999999999;
        for (int i = 1; i < n; i++) {
            if (l1.get(i) < min) {
                min = l1.get(i);
            }
        }
        return min;

    }

    public static double problem_2(int n, List<Integer> l2) {
        double average = 0;

        for(int i = 0; i < n; i++){
            average += l2.get(i);
        }

        return average/n;
    }

    public static String problem_3(int n, int i){
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
            return problem_8(a, i + 1); // Если символ в индексе 'i' является цифрой, переходим к следующему символу
        } else {
            return "No"; // Если символ в индексе 'i' не является цифрой, возвращаем "No"
        }
    }
}
