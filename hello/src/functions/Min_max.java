package functions;

import java.util.Scanner;

public class Min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maximum(a, b, c);
        minimum(a, b, c);
        sc.close();
    }
    static void maximum(int a,int b, int c){
        if (a > b){
            if(a>c){
                System.out.println(a+" is the largest number.");
            }
            else{
                System.out.println(c+" is the largest number");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is the largest number.");
            }
            else{
                System.out.println(c+" is the largest number");
            }
        }
    }
    static void minimum(int a,int b, int c){
        if (a < b){
            if(a<c){
                System.out.println(a+" is the smallest number.");
            }
            else{
                System.out.println(c+" is the smallest number");
            }
        }
        else{
            if(b<c){
                System.out.println(b+" is the smallest number.");
            }
            else{
                System.out.println(c+" is the smallest number");
            }
        }
    }
}
