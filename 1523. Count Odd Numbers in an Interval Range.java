1523. Count Odd Numbers in an Interval Range https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

BRUTEFORCE or Dumb SOLUTION O(n)(TLE)use for LOOP to count the odd number and return it

class Solution {
    public int countOdds(int low, int high) {
        int count =0;
        for(int i=low; i<=high; i++)
        {
            if(i%2==1)
                count++;
        }   return count;
    }

}

OPTIMISEDsolution O(1)
use formula and return the value 

class Solution {
    public int countOdds(int low, int high) {
        if((low%2==0)&&(high%2==0))
            return (high-low)/2;
        else 
            return(high-low)/2+1;
    }
}
