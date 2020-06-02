public class Solution {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int res[] = new int[1];
        res[0] = nums[0];
        for(int i=1; i<nums.length; i++){

            int[] temp = new int[res.length+1];
            for(int k = index[i]; k<temp.length; k++){
                int t = nums[k];
                for(int p =0; p<index[i]; p++)
                    temp[p] = res[p];
                

            }

        }
    }

    public static void main(String[] args) {
       createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1});
    }
}
