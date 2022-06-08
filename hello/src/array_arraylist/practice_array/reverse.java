package array_arraylist.practice_array;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
                
        int[] result = reverse_arr(arr);
        System.out.println("Reversed Array");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }

    static int[] reverse_arr(int[] arr ) {
        int[] temp = new int[arr.length];
        int j=0;
        for (int i = (arr.length-1) ; i >= 0; i--) {
            temp[j]=arr[i];
            j++;
            
        }
        return temp;

    }

}
