class Solution {
    private int getmax(int []piles){
        int max=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        return max;
    }
    private int helper(int []piles, int speed){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total+= Math.ceil((double)piles[i]/speed);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=getmax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int totalways=helper(piles,mid);
            if(totalways<=h){// aur slow chalo
                high=mid-1; 
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
}