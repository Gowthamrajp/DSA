1502. Can Make Arithmetic Progression From Sequence - https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/ 

Better solution
used built in function to sort the array and used formula to find the difference value of the AP 
then used a loop to check the spacing of each element, then returned true or false based on it

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = (arr[arr.length-1]-arr[0])/(arr.length-1);
        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i]+diff!=arr[i+1])
            {
                return false;
            }
        } 
        return true;
    }
}