167. Two Sum II - Input Array Is Sorted
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
BRUTEFORCE SOLUTION - 
TIME O(N2)
SPACE O(1)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=i+1; j<numbers.length;j++)   //two for loops to traverse array
            {
                if(numbers[i]+numbers[j]==target)  //finding complementary element  
                    return new int[]{i+1,j+1};
            }
        } return new int[]{-1,-1} ;
    }
}