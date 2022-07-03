167. Two Sum II-Input Array Is Sorted https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

BRUTEFORCE SOLUTION-TIME O(N2)SPACE O(1)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) // two for loops to traverse array
            {
                if (numbers[i] + numbers[j] == target) // finding complementary element
                    return new int[] { i + 1, j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }}

    BETTER SOLUTION-
    FOR LOOP+BINARY SEARCH

O(NLOGN)
OPTIMISED SOLUTION - TWO POINTER 
O(N)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        
        while(start<end)
        {
            if(numbers[start]+numbers[end]>target)
            {
                end--;
            }
            else if(numbers[start]+numbers[end]<target)
            {
                start++;
            }       
            else return new int[]{start+1,end+1};
                             
        }
            return new int[]{0,0};         
    }
}