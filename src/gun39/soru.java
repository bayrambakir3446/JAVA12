package gun39;

public class soru {
    public static void main(String[] args) {

        // bir dizi iicnden en buyuk degeri bulan bir metod yazalim
        int [] numbers={20,30,40,50,60,70,80};
        System.out.println(maxValue(numbers));

    }public static int maxValue(int[]arr){
        Integer max=Integer.MIN_VALUE;
        for (Integer bulunanansayi:arr){  //burada Integer yerine int  de yazabilirim.ama burada amac Integer yapisini kulllanarak bu soruyu cozebiliyorum
            if(bulunanansayi>max){
                max=bulunanansayi;

            }
        }return max;
    }
}
