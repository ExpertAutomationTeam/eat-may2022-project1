package exceptions.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseTryAndCatch {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader;

        try {
            fileReader = new FileReader("/Users/nacer-zimu/IdeaProjects/may22-java-project/src/class-notes");
        }catch (FileNotFoundException e){

        }

        try{
            bufferedReader = new BufferedReader(fileReader);
            String str = null;

            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
        }catch (IOException e1){

        }

    }
}
