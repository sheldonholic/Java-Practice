package functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        String result = prime_or_not(a);
        System.out.println(result);
        sc.close();
    }

    static String prime_or_not(int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }
}
