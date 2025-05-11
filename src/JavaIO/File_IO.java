package JavaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        writer.write("Hello ,This is Anuj's file");
        writer.close();

        FileReader reader = new FileReader("output.txt");
        int i;
        while((i = reader.read()) != -1){
            System.out.print((char)i);
        }
        reader.close();
    }
}
