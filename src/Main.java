import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Hello! \nChoose are task(1-10):");
        int n = scn.nextInt();


        switch (n) {
            case 1:
                Menu.task1();
            case 2:
                Menu.task2();
            case 3:
                Menu.task3();
            case 4:
                Menu.task4();
            case 5:
                Menu.task5();
            case 6:
                Menu.task6();
            case 7:
                Menu.task7();
            case 8:
                Menu.task8();
            case 9:
                Menu.task9();
            case 10:
                Menu.task10();
        }

    }

}