package binarySearch;

import java.util.Scanner;

public class reverseBinary {
    public static void main(String[] args) {
        int[] arr = {35,33,30,28,26,24,22,20,10,9,7,4,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element number: ");
        int target = sc.nextInt();
        if(BinarySearch(arr, target, 0, arr.length-1)>=0){
            System.out.println("Element found at index "+BinarySearch(arr, target, 0, arr.length-1));
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
    public static int BinarySearch(int[] arr,int target,int start,int end) {
        /* int midElem = (start+end)/2; 
        this is the traditional way to code */
        //better way is so that it doesnt exceed integer walue
        int midElem = start + (end-start)/2;
        if(start<=end){
            if(target<arr[midElem]){
                return BinarySearch(arr, target, midElem+1, end);
            }
            if(target>arr[midElem]){
                return BinarySearch(arr, target, start, midElem-1);
            }
            if(target == arr[midElem]){
                return midElem;
            }
        }
               
        return -1;
    }
}
