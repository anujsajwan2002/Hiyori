package String;

import java.util.*;

public class StringMethod {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Java ");
        sb.append("Programming!!");
        System.out.println(sb);
        sb.insert(4,"ANUJ");
        System.out.println(sb);
        sb.delete(4,8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
