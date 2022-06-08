package linearSearch;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        //make an array 
        int[] array = {34,7,99,674,12,3,4,89};
        System.out.println("enter value : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(LinearSearch(array,target));sc.close();
    }

    private static int LinearSearch(int[] array, int target) {
        if(array.length==0){
            return -1;
        }

        // running linear search loop  // enhanced for loop 
        for (int Element : array) {
                  
            if(Element==target){
                return Element;
            }
        }
        return -1;
    }
}
