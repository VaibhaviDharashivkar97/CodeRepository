import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
        for(int i=0; i<candies.length; i++){
            boolean var = false;
            for(int j=0; j<candies.length; j++){
                if(i==j)
                    continue;
                if(candies[i]+extraCandies<candies[j]) {
                    result.add(false);
                    var = true;
                    break;
                }
            }
            if(!var)
                result.add(true);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] a = {2,3,5,1,3};
        System.out.println(kidsWithCandies(a,3));
    }

}
