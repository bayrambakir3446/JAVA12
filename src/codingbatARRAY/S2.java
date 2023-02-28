package codingbatARRAY;

import java.util.Arrays;

public class S2 {
    //Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
    //her arrayin boyu  hangisi daha buyukse ilk eleman veya son eleman buyuk olana esitle
    //
    //maxEnd3([1, 2, 3]) → [3, 3, 3]
    //maxEnd3([11, 5, 9]) → [11, 11, 11]
    //maxEnd3([2, 11, 3]) → [3, 3, 3]
    public static void main(String[] args) {
      int  maxEnd3 [] = {1, 2, 3};
        System.out.println(Arrays.toString(maxEnd3(maxEnd3)));

    }
    public static int[] maxEnd3(int [] nums){
        int max;
        if( nums[0]>nums[nums.length-1])
            max=nums[0];
        else  max=nums[nums.length-1];
        nums[0]=max;
        nums[1]=max;
        nums[2]=max;
        return nums;

    }
}
