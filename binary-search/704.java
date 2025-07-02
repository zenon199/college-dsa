
//https://leetcode.com/problems/binary-search/submissions/1537661597/?envType=problem-list-v2&envId=binary-search
class Solution {
    public int search(int[] nums, int target) {
       int s = 0;
       int e = nums.length -1;
        while(s <= e) {
       int m = (s + e) / 2;
       if(nums[m] == target) return m;
       else if(nums[m] < target) s = m+1;
       else if(nums[m] > target) e = m-1;
        }
        return -1;
    }
}
