package linearSearch;

import java.util.Scanner;

public class demo_search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] array1 = {34,56,2,3,46,171};
        System.out.println("Element you wanna search : ");
        int value = sc.nextInt();
        String result = LinearSearchFindElem(array1, value);
        System.out.println(result);sc.close();
    }
    public static String LinearSearchFindElem(int[] array1,int value) {
        for (int i = 0; i < array1.length; i++) {
            if(array1[i]==value){
                return "yes";
            }
        }
        return "no";
}}
