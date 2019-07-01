package com.stackroute.pe;
import java.io.File;
import java.io.FileReader;

public class TextReader {
    public static void main(String[] args) throws Exception {

        // pass the path to the file as a parameter
        FileReader fr =
                new FileReader("/home/nandini/Pe2/src/main/java/com/stackroute/pe/program");

        int i;
        int count=0;
        while ((i = fr.read()) != -1) {
            count++;
            System.out.println((Character.toUpperCase((char) i)));

        }
        System.out.println(count);
    }

}
