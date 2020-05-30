public class Solution {

        public static void moveZeroes(int[] nums) {
            int i = 0;
            for(int j=1; j<nums.length; j++){
                if(nums[i] == 0){
                    while(nums[j]==0) {
                        if (j == nums.length - 1)
                            break;
                        j++;
                    }
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                i++;
            }

            for (int k: nums)
                System.out.println(k);

        }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,0});
    }

}
