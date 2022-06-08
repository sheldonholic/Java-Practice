package functions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        String result = palindrome_check(number);
        System.out.println(result);  
        sc.close();              
    }
    static String palindrome_check(int num){
        int number = num;
        int temp = 0;
       while( number > 0 ) {
            int remainder = number%10;
            temp = (temp*10) + remainder;
            number = number/10;
        }
        if(temp == num){
            return "Palindrome";
        }
        else{
            return "Not Palindrome";
        }
    }
}
