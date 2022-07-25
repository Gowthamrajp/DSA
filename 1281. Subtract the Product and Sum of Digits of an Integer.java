https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

Best solution 
used while loop and seperated the digits from the right end and used it to update 
the sum and product in each iteration of the while loop 

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;int product =1 ; 
        while(n>0)
        { 
            sum+=n%10;
            product*=n%10;
            n/=10;
        } 
        return product-sum;
    }
}