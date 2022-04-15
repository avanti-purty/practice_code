package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistToArray {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList();
        arr.add("abant");
        arr.add("abat");
        arr.add("aban");
        arr.add("aant");
        System.out.println(arr);
        String[]st= new String[arr.size()];
        arr.toArray(st);
        for(String s:st){
            System.out.println(s);
        }
    }
}
