package array_arraylist;

import java.util.*;

public class array2d {
    public static void main(String[] args) {
        
        
        user_input();
        
    }
    public static void predefined() {
        int[][] matrix1 = {
            {2,3},
            {2,3,4,5,5,6},
            {3,45,6,7}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void user_input() {
        int[][] matrix = new int[3][3]; 
        //adding the rows size is mandatory . we can skip the column size but cannot skip row size
        Scanner sc = new Scanner(System.in);
        System.out.println(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }

    
}
    
