package linearSearch;

import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String name = sc.nextLine();
        System.out.println("Enter a character to find : ");
        // takes character input in the string
        char target = sc.next().charAt(0);
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
        System.out.println(name.toCharArray());
        sc.close();
    }

    private static boolean search(String name, char target) {
        //length() is a string function. Determines the length of the string passed.
        if(name.length()==0){
            return false;
        }

        // charAt is a function that reads each character of a string.
        
            for (int i = 0; i < name.length(); i++)
         {
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }

    private static boolean search2(String name, char target) {
        //length() is a string function. Determines the length of the string passed.
        if(name.length()==0){
            return false;
        }

        // charAt is a function that reads each character of a string.
        // foreach loop we need to convert anything into and array 
        /*
        toCharArray() - converts string "name " to array for iteration
         */
            for (char ch : name.toCharArray()) 
         {
            if(ch ==target){
                return true;
            }
        }
        return false;
    }
}
