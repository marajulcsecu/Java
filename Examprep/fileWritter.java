package Examprep;

import java.io.FileWriter;
import java.io.IOException;

public class fileWritter {
    public static void main(String[] args) {
String fileName="hello1.txt";
try(FileWriter writer = new FileWriter(fileName)) {
    writer.write("this is my exam prep");
    writer.flush();
    System.out.println("file written successfully");
}
catch (IOException exception){
    System.out.printf("exception occurred %s",
            exception.getMessage());
}

    }
}
