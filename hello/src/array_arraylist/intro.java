package array_arraylist;

import java.util.*;

public class intro {    
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("State 4 numbers :");
        int[] arr = new int[4];
     for (int i = 0; i < arr.length; i++) {
        // arr.length helps us to find the length of the array.
        arr[i]=in.nextInt();
    }
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }

    //enhanced for loop //foreach
    for (int i : arr) { // here each i becomes the arr[i]
        System.out.println("\n"+i);        // prints the element of array. = print(arr[i])
    }
    System.out.println(Arrays.toString(arr)); //converts array to string. Arrays package - to string function
    arr[1]=678; //modify 
    System.out.println(Arrays.toString(arr));
    in.close();
    }
    
}
