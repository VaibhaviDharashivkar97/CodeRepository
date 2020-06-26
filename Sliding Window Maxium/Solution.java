import java.util.*;

//https://www.youtube.com/watch?v=fbkvdWUS5Ic

public class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length ==0 || k>nums.length)
            return new int[0];
        else if(k == 1)
            return nums;


        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            if(!dq.isEmpty() && dq.peekFirst() == i - k){
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

            if(i >= k - 1){
                result[i-k+1] = nums[dq.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] res = maxSlidingWindow(new int[]{7,2,4}, 2);
        for (int re : res) System.out.println(re);
    }
}



/*if(nums[i+k-1] > currentMax && i!=0){
                result[i] = nums[i+k-1];
                currentMax = nums[i+k-1];
                continue;
            }
            else if (nums[i+k-1] < currentMax && i!=0){
                result[i] = currentMax;
                continue;
            }
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = i, m = 0; j < i + k; j++, m++){
                temp.add(nums[j]);
            }
            currentMax = Collections.max(temp);
            result[i] = currentMax;*/