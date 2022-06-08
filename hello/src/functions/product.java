package functions;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = product1(a,b);
        System.out.println("product is "+ prod);
        sc.close();
    }
    static int product1(int a , int b){
        int prod = a*b;
        return prod;
    }
}
