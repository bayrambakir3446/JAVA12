package codingbatARRAY;

public class S1 {
    //Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
    // eger 6 Arayin ilk elemani veya son elemani ise true dön
    //
    //firstLast6([1, 2, 6]) → true
    //firstLast6([6, 1, 2, 3]) → true
    //firstLast6([13, 6, 1, 2, 3]) → false
    public static void main(String[] args) {
        //int firstLast6[]={1,2,6};
        //int firstLast6[]={6,1,2,3};
        int firstLast6[]={13,6,1,2,3};
        System.out.println(firstLast6(firstLast6));
    }  public static boolean firstLast6(int [] nums){
        if (nums[0]==6||nums[nums.length-1]==6)
return true; else return false;

    }
}
