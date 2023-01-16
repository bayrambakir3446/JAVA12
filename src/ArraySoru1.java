import java.util.Arrays;

public class ArraySoru1 {
    public static void main(String[] args) {
        //Array kabul eden bir method yazın,method array deki en küçük sayıyı bulup
        //diğer elemanların yerine yazsın,bize yeni array i dönsün
        //örn: int x={5,6,9}; ----> [5,5,5]
        // int a={136,76,9,-15,2500}; ---->[2500,2500,2500,2500,2500]
        // System.out.println(Arrays.toString(min(x)));
        int [] x={5,6,3};
         Arraymethods(x);
        System.out.println(Arrays.toString(Arraymethods(x)));
    }

    public static int [] Arraymethods(int arr[]) {
       int min=arr[0];
        for (int sayi : arr) {
            if(min>sayi){
                min=sayi;
            }

    }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=min;


        }
        return arr;
}}
