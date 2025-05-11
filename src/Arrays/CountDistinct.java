package Arrays;

import java.util.*;
import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args){
        int[] arr = {22,1,2,1,2,5,6,7};
        Set<Integer> set = new HashSet<>();

        for(int elements : arr){
            set.add(elements);
        }
        System.out.println("Distinct Count:" + set.size());
        System.out.println("Distinct Elements:" + set);
        System.out.println("He said, \"Java is fun!\"\nLet's learn it.");


    }
}
