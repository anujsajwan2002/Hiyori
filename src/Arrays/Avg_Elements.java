package Arrays;

public class Avg_Elements {
    public static void main(String[] args){

        int[] arr = {1,2,5,7,10,6};
        int sum = 0;

        for(int num:arr){
            sum +=num;
        }
        double avg = (double)sum/ arr.length;
        System.out.println("Avg of elements is : " + avg);
    }
}
