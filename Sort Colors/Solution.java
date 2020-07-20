public class Solution {
    public static void sortColors(int[] nums) {
        int j=0;
        int n = nums.length-1;
        for(int i=0; i<=n; i++){
            if(nums[i] == 0){
                nums[i] = nums[j];
                nums[j] = 0;
                j++;
            }
            if(nums[i] == 2){
                nums[i] = nums[n];
                nums[n] = 2;
                n--;
                i--;
            }
        }

        for(int i: nums)
            System.out.println(i);
    }

    public static void main(String[] args) {
        sortColors(new int[]{2,0,1});
    }
}
