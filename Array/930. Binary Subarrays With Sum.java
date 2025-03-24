class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)- helper(nums,goal-1);
        //First you find the number of subarrays with sum less than or equal to goal
// then find the number of subarrays with sum less than or equal to goal - 1.
// Then just return the difference of the two as it will contain the number of subarrays with sum == goal.


//     sum==goal  =[  sum<=goal  - (sum<=goal -1) ]

        
    }
    public int helper(int []nums, int goal){//sum <=goal 
        if(goal<0) return 0;
        int l=0, r=0;
        int sum=0;
        int count=0;
        while(r<nums.length){
            sum+=nums[r];

            while(sum>goal){//shrink
                sum-=nums[l];
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }
}
