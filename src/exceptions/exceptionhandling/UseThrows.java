package exceptions.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseThrows {
    public static void main(String[] args) throws IOException{

        FileReader fileReader = new FileReader("/Users/nacer-zimu/IdeaProjects/may22-java-project/src/class-notes");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = null;

        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }

    }
}
