package gun61;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileOps {
    public static void main(String[] args) {
        File file=new File ("Data.txt");
        Scanner satirOku=null;
        try{
            System.out.println(satirOku.nextLine());
        }catch (NoSuchElementException olmayanSatir){

    }
}}
