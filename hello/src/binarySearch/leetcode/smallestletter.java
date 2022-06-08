package binarySearch.leetcode;

import java.util.Scanner;

public class smallestletter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'a','d','f','j'};
        System.out.println("Enter a target : ");
        
        String target = sc.next();
        char target1 = target.charAt(0);
        if(smallestLetter(arr, target1, 0, arr.length-1) > 0){
            System.out.println(smallestLetter(arr, target1, 0, arr.length-1));
        }
        else{
            System.out.println("No found");
        }
        sc.close();
    }

    private static char smallestLetter(char[] arr, char target1, int start, int end) {
        
        int midElem = start + (end-start)/2;
        for (int i = target1+1; i < arr.length; i++) {
            
            if(i>arr[midElem]){
                return smallestLetter(arr, (char) i, midElem+1, end);
            }
            if(i<arr[midElem]){
                return smallestLetter(arr, (char) i, start, midElem-1);
            }
            if(i == arr[midElem]){
                return arr[midElem];
            }
        }
        return (char)0;
    }
}
