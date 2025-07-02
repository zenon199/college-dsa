

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1683771764/
class Solution {
    // public char nextGreatestLetter(char[] letters, char target) {
    //     for(int i = 0; i < letters.length; i++) {
    //         if(letters[i] > target) return letters[i];
    //     }
    //     return letters[0];
    // }
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;

        if(letters[r] <= target) return letters[0];
        
        while(l < r) {
            int m = l + (r - l) /2;

            if(letters[m] <= target) l = m+1;
            else r = m;
        }
        return letters[r];
    }
}