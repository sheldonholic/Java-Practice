package functions;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        String result = OddEven(number);
        System.out.println(result);
        sc.close();
    }

    static String OddEven(int num){
        if(num%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
