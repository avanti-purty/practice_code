import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArraylist {
    public static void main(String[] args) {
        Integer[] in={1,2,3,4,5,6,7};
        //Mehtod1
        List<Integer> al= Arrays.asList(in);
        System.out.println(al);
        //Method 2
        ArrayList<Integer>ls= new ArrayList<>();
        for(Integer i:in){
            System.out.println(i);
        }
        //Method3

    }
}
