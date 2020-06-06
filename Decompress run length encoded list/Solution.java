import java.util.ArrayList;

public class Solution {
    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0,j=1; i<nums.length; i+=2,j+=2){
            for(int n=0; n<nums[i]; n++){
                result.add(nums[j]);
            }
        }
        int [] res = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] temp = {1,2,3,4};
        decompressRLElist(temp);
    }
}
