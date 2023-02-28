package codingbatARRAY;

public class S3 {
//    //Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
//Arrayin ilk iki elemanini topla eger array iki elemandan daha az ise 0 don veya daha fazla ise ilk iki elemanin toplamini don
//
//    sum2([1, 2, 3]) → 3
//    sum2([1, 1]) → 2
//    sum2([1, 1, 1, 1]) → 2
public static void main(String[] args) {
    int []sum ={5,6,3,5,10};
    System.out.println(sum2(sum));
}
public static int sum2( int [] nums){
    if (nums.length==0)
        return 0;
    else if (nums.length==1) return nums[0];
        else return nums[0]+nums[1];
        

}
}
