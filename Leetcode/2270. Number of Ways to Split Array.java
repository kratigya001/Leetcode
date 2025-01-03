class Solution {
    public int waysToSplitArray(int[] nums) {
        int n= nums.length;
        long totalsum=0;
        for(int num: nums){
            totalsum +=num;
        }
        long presum=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            presum+= nums[i];
            long suffixsum=totalsum-presum;
            if(presum>=suffixsum){
                count++;
            }

        }
        return count;
        
    }
}