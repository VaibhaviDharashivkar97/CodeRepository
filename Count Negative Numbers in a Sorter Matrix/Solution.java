public class Solution {

        public static int countNegatives(int[][] grid)
        {

            int c = 0;
            for (int i = 0, end = grid[i].length - 1; i < grid.length; i++) {
                int start = 0;
                while (start <= end) {
                    int mid = start + (end - start)/2;
                    if (grid[i][mid] < 0) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                c = c + grid[i].length - start;
//                end = start - 1;
            }
            return c;

        }

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}}));
    }
}
