package functions;

import java.util.Scanner;

public class pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        pythagorean_triplet(a, b, c);
        sc.close();
    }
    static void pythagorean_triplet(int a , int b , int c ){
        if (a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==a*a ){
            System.out.println("These are pythagorean triplets.");
        }
        else{
            System.out.println("They are not pythagorean triplets.");
        }
    }
}
