package gun61;

public class HandlingException {
    public static void main(String[] args) {


    // handling exception with try catch block
    try{
        System.out.println(1/0);

    }catch(Exception e){  //buradaki () li kisim olmak zorunda icerisine Exception yazilip kullanilabilir
        System.out.println("can not devided by zero");


    }
}}
