package array_arraylist;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(23);
        list.add(23);
        list.add(230);
        list.add(240);list.add(220);
        list.set(2, 67);
        System.out.println(list);
    }
}
