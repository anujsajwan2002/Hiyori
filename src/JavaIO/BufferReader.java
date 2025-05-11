package JavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//use BufferedReader (efficient for large input)
public class BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Age: ");
        String age = reader.readLine();
        System.out.println("My age is: " + age);

    }
}
