
//https://leetcode.com/problems/find-the-duplicate-number/submissions/?envType=problem-list-v2&envId=binary-search
class Solution {
    public int findDuplicate(int[] nums) {
        int l = 1;
        int h = nums.length - 1;
        while(l< h) {
            int c = 0;
            int m = l+(h-l) / 2;
            for(int i =0; i< nums.length; i++)
                if(nums[i] <= m) c++;
            if(c <= m) l = m+1;
                else h = m;
        
        }
        return l;

    }
}