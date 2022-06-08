package linearSearch;

import java.util.Scanner;

public class evenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements : ");
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < array.length; i++) {
            int result =  noofDigit(array,i);
            if(result%2==0){
                count++;
            }
        }
        System.out.println("Digits with even number: "+count);
        sc.close();
    }

    private static int noofDigit(int[] array, int i) {
        int count=0;
        int number = array[i];
        while(number>0){
            count++;
            number/=10;
        }
        return count;
    }
}
