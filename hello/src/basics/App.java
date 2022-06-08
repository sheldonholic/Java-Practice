package basics;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        sum(); // accessing method of same class without return type.
        int answer = sum2(); // accessing method of same class with return type int.
        System.out.println(answer);
        String name = Str.return_hello(); // accessing method of other class with return type String.
        System.out.println(name);*/
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String hello_name = Str.name(name);
        System.out.println(hello_name); 
        sc.close();
    }

    // without return type  - void 
    static void sum (){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int a = sc.nextInt();
        System.out.println("enter number two:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is "+sum);
        sc.close();

    }
    //with return type same functions - integer 
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int a = sc.nextInt();
        System.out.println("enter number two:");
        int b = sc.nextInt();
        int sum = a+b;
        sc.close();
        return sum;
       
    }
}
