package sorting;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = selection(arr);
        System.out.println(Arrays.toString(arr)+" no.of times swapped : "+count);
        sc.close();
    }

    public static int selection(int[] arr) {
        int swapCount =0; // best case = worst case = O(N^2)
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int index = 0;  // reference to swap 
            int last = arr.length-1-i; // last index of remaining array 
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>max){
                    max = arr[j];
                    index = j;
                }
            }
            //swap
            arr[index] = arr[last];
            arr[last] = max;
            swapCount ++;
        }
        return swapCount;
    }
}
