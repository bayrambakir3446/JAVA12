package codingbatARRAY;

import java.util.Arrays;

public class S5 {
// Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
//Verilen dizideki çift ints sayısını döndürün. Not: % 'mod' operatörü geri kalanını hesaplar, örneğin % 5 2 1'dir.
// yani Arraydeki elemanlari dolas ve cift ise count u bir artir
//    countEvens([2, 1, 2, 3, 4]) → 3
//    countEvens([2, 2, 0]) → 3
//    countEvens([1, 3, 5]) → 0
public static void main(String[] args) {
    int [] a ={3,4,6,8};
  //
    countEvents(a);
}
public static int[] countEvents(int[] nums) {
    int count =0;
    for(int i=0;i<nums.length;i++){
if(nums[i]%2==0){ count++;
count=i;
}
    }
    System.out.println(count);
    System.out.println(Arrays.toString(nums));
    return nums;

}
}

