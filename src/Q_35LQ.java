import java.util.Scanner;
public class Q_35LQ {
    public static void main(String arg[]){
        int nums []={1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
      int low=0;
      int high= nums.length -1 ;
      while (low<= high){
          int middlepointer=(low+high)/2;
          int middlenumber=nums[middlepointer];

          if (target==middlenumber){
              return middlepointer;
          }
          if (target<middlenumber){
              high=middlepointer-1;
          }
          else{
              low=middlepointer+1;
          }
      }
      return low;
    }
}
