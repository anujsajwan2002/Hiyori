package Arrays;

import java.util.*;

public class Check_Sorted {
    public static void main(String[] args){
        int[] arr = {3,8,4,5,1};
        boolean isSorted = true;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted.");
        }else{
            System.out.println("The array is not Sorted");
        }
    }
}


