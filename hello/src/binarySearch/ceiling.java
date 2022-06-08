package binarySearch;
import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,5,6,7,14,20,25,29};
        System.out.println("Enter a target : ");
        int target = sc.nextInt();
        System.out.println(ceilingValue(arr, target, 0, arr.length-1));
        sc.close();
    }
    public static int ceilingValue(int[] arr, int target, int start, int end) {
        /*
        shalaka's Approach
        
        for (int i = target; i <= arr[end]; i++) {
            if(intro.BinarySearch(arr, i, start, end)>=0){
                return arr[intro.BinarySearch(arr, i, start, end)];
            }
        }
        return 0;
        */
        /*Kunal's approach*/
        int midElem = start + (end-start)/2;
        while(start<=end){
            if(target>arr[midElem]){
                return ceilingValue(arr, target, midElem+1, end);
            }
            if(target<arr[midElem]){
                return ceilingValue(arr, target, start, midElem-1);
            }
            if(target == arr[midElem]){
                return midElem;
            }
        }
               
        return arr[start];
    }
}
