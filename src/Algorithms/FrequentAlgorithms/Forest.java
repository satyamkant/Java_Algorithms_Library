class Forest{
    private final long[][] sum;
    public Forest(int n,int m,List<List<Integer>> arr){
        sum = new long[n + 10][m + 10];
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= m;j++){
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + arr.get(i-1).get(j-1);
            }
        }
    }

    /**
     * Important !! send 1 based indexing !!
     * @return sum of matrix (x1,y1) -> (x2,y2)
     */
    public long getSum(int x1,int y1,int x2,int y2){
        x1--;
        y1--;
        return sum[x1][y1] - sum[x2][y1] - sum[x1][y2] + sum[x2][y2];
    }
}
