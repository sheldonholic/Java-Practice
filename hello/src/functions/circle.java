package functions;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        double area = area(radius);
        double circumcircle = circumcircle(radius);
        sc.close();
        System.out.println("Area is "+area+" Circumcircle is " + circumcircle);
    }

    static double circumcircle(int radius){
        double circumcircle = 2*(Math.PI)*radius;
        return circumcircle;
    }

    static double area(int radius){
        double area = Math.PI*radius*radius;
        return area;
    }
}
