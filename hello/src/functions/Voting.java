package functions;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        Eligibility(age);sc.close();
    }
    static void Eligibility(int age){
        if(age>=18){
            System.out.println("Eligible to vote ! ");
        }
        else{
            System.out.println("Not eligible to vote !");
        }
    }
}
