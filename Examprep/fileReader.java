package Examprep;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        String filename = "hello.txt";
        try (FileReader reader = new FileReader(filename)){
            System.out.println(reader.read());
        } catch (IOException e){
            System.out.printf("exception is %s",
                    e.getMessage());
        }
    }
}
