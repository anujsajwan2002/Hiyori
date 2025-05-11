package String;

import java.util.regex.*;

public class PatternSearching {
    public static void main(String[] args){
        String text = "Anuj is an Awesome Guy!!";
        Pattern pattern = Pattern.compile("Guy");
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            System.out.println("Pattern Found at index: " + matcher.start());
        }
    }
}
