1822. Sign of the Product of an Array - https://leetcode.com/problems/sign-of-the-product-of-an-array/

Better solution 
we use an int variable to show sign on the product. we traverse the array and everytime we find a -ve number we 
change the sign and if we find a zero we return 0 . and finally after traversing we return sign

class Solution {
    public int arraySign(int[] nums) {
        int sign =1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<0) sign = sign*(-1);
            else if(nums[i]==0) return 0;
        }
    
        return sign;
    }
}
