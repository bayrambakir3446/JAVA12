package codingbatARRAY;

import java.util.Arrays;

public class S4 {
//    //Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
//Bir int dizisi göz önüne alındığında, son öğesinin orijinal diziyle aynı olduğu ve diğer tüm öğelerin 0 olduğu çift(iki kati) uzunluğa sahip yeni bir dizi döndür. Orijinal dizi uzunluk 1 veya daha fazla olacaktır.
// Not: Varsayılan olarak, yeni bir INT dizisi tüm 0'ları içerir.
//
//    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//    makeLast([1, 2]) → [0, 0, 0, 2]
//    makeLast([3]) → [0, 3]
public static void main(String[] args) {
// default olarak int [] sonuc=new int [5];  in tum elemanlari 0 olsun diyor  ben buradan son elemani degistirirsem lay kapanir
    // ama bu kodiing bat sorusu oldugu icin farkli yapmam lazim
    int [] num={7,6,5};
    System.out.println(makeLast(num));

}
public static int [] makeLast(int [] nums){
    int [] num=new int[nums.length*2];
    num[num.length-1]=nums[nums.length-1];
for(int i=0;i<num.length-1;i++){
    num[i]=0;

}
  System.out.println(Arrays.toString(num));
    return  num;
}
}
