package bubbleSort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * intro
 */
public class intro {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the order : \n 1. Ascending \n 2. Descending : \n");
        int option = sc.nextInt();
        if(option == 1 ){
            int count = bubbleSort(arr);
            System.out.println("No.of times swapped : "+count);
            System.out.println(Arrays.toString(arr)); //prints the array - built-in method
        }
        else if(option == 2){
            int count = bubbleSort(arr,-1);
            System.out.println("No.of times swapped : "+count);
            System.out.println(Arrays.toString(arr));
        }
        else{
            System.out.println("Wrong option");

        }
        sc.close();
    }

    public static int bubbleSort(int[] arr) {
        int i=1;
        int count =0;
        while(i<arr.length){
            int j=0;
            
            while(j<=arr.length-1-i){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;

                count ++;
                }
                j++;
            }
            if (count == 0){
                return count;
            }
            i++;
        }
        return count ;
    }
    public static int bubbleSort(int[] arr,int desc) {
        int i=1;
        int count =0;
        while(i<arr.length){
            int j=0;
            
            while(j<=arr.length-1-i){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;

                count ++;
                }
                j++;
            }
            if (count == 0){
                return count;
            }
            i++;
        }
        return count ;
    }
}