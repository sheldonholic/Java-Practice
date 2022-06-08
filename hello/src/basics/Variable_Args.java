package basics;
import java.util.*;
public class Variable_Args {

    static void print_num(int ...d){
        System.out.println(Arrays.toString(d));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter how many numbers do you wanna add ?");
        int num_iter= sc.nextInt();
        int[] num = new int[num_iter];
        for (int i = 0; i < num_iter; i++) {
            num[i]=sc.nextInt();
        }
        print_num(num);
        sc.close();
    }
}
