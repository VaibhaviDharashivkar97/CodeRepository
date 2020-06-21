public class Solution {

    public static int[] searchRange(int[] nums, int target) {
        return new int[]{firstIndex(nums, target), lastIndex(nums, target)};
    }

    public static int firstIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(nums[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;
            if(nums[mid] == target)
                index = mid;
        }
        return index;
    }

    public static int lastIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<end){
            int mid = (start + end)/2;
            if(nums[mid] <= target)
                start = mid + 1;
            else
                end = mid - 1;
            if(nums[mid] == target)
                index = mid;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a = searchRange(new int[]{5,7,7,8,8,10}, 8);
        for(int i: a) System.out.println(i);
    }

}
