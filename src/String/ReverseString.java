package String;


//using loop
public class ReverseString {
    public static void main(String[] args){
        String str = "Anuj Singh Sajwan";
        String reverse = "";  //Empty String

        for(int i = str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reversed String is : " + reverse);
    }
}
