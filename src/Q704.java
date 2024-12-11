public class Q704 {
    public static void main(String arg[]){
        int [] nums={-1,0,3,5,9,12};
        int target=9;
        int a=search( nums,target);
        System.out.println(a);
    }
    public static int search(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        int a=tag(nums,high,low,target);
        return a;

    }
    public static int tag(int []nums, int high ,int low ,int target){
        while(high>=low) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                return tag(nums, mid - 1, low, target);
            } else {
                return tag(nums, high, mid + 1, target);
            }
        }
        return -1;
    }
}
