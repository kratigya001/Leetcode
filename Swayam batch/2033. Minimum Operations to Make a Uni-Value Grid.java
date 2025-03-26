class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        int count=0;
        int []arr=new int [m * n];

        int base=grid[0][0];
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if( grid[i][j]%x != base%x ){
                return -1;
              }
              arr[index++]= grid[i][j];
            }
        }
        Arrays.sort(arr);

        int mid= arr[total/2];

        for(int num:arr){
            count+=Math.abs( num-mid)/x;
        }
        return count;

    
    
    }
}