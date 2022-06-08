package array_arraylist.practice_array;

import java.util.*;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=maxValue(arr);
        System.out.println("Maximum value in the array is "+max);
        System.out.println("Enter the range values : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int max_r= maxInRange(arr, start-1, end-1); // to make it more user friendly 
        System.out.println(max_r);
        sc.close();
    }

    static int maxValue(int[] arr) {
        int max= 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int maxInRange(int[] arr,int start,int end) {
        int max= 0;
        for (int i = start; i <= end; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }


}
