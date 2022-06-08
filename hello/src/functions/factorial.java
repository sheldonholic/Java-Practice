package functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int fact = factorial_cal(number);
        System.out.println(fact);
        sc.close();
    }
    static int factorial_cal(int num){
        int factorial = 1;
        int i = 1;
        while(i<=num){
            factorial=factorial*i;
            i++;
        }
        return factorial;

    }
}
