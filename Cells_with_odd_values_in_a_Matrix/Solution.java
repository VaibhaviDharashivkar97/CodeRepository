public class Solution {
    public static int oddCells(int n, int m, int[][] indices) {
        int[][] var = new int[n][m];
        int counter = 0;

        for (int[] index : indices) {
            for (int ci = 0; ci < 2; ci++) {
                int k = index[ci];
                if (ci == 0) {
                    for (int row = 0; row < m; row++) {
                        var[k][row] += 1;
                    }
                } else {
                    for (int col = 0; col < n; col++) {
                        var[col][k] += 1;
                    }
                }
            }
        }

        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                if(var[i][j]%2 !=0)
                    counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(2, 3, indices));
    }
}






/*
for(int ri=0; ri<indices.length; ri++){
        for(int ci=0; ci<2; ci++){
        for(int row=0; row<n; row++) {
        int incr = indices[ri][ci];
        var[incr][row] += 1;
        }
        for(int col=0; col<m; col++){
        int incr = indices[ri][ci];
        var[col][incr] += 1;
        }
        }
        }

        for (int i=0; i<n; i++) {
        for(int j=0; j<m; j++){
        if(indices[i][j]%2 !=0)
        counter++;
        }
        }*/
