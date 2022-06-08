package linearSearch;

import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter values: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Minimum value : "+minimumValue(array));
        sc.close();
    }

    static int minimumValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
