package array_arraylist.practice_array;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values :");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter two elements to be swapped: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        swap_arr(arr, a, b);
        sc.close();

    }

    static void swap_arr(int[] arr ,int elem1 ,int elem2 ){
        int index1=0;
        int index2=0;
        for (int i = 0; i < arr.length; i++) {
            if(elem1==arr[i]){
                index1 = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(elem2==arr[i]){
                index2 = i;
            }
        }
        int temp =0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
