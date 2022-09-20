989. Add to Array-Form of Integer - https://leetcode.com/problems/add-to-array-form-of-integer/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int temp=0;
        
        num[num.length-1]+=k;                       //added the k to the end
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<num.length;i++)
            res.add(num[i]);                        //assigning elements to array list
        
        for(int i=num.length-1;i>0;i--){            // iterating from the back and doing carry forward
            temp=res.get(i);
            res.set(i,temp%10);
            res.set(i-1,res.get(i-1)+temp/10);
        }
        while(res.get(0)>9){                        // checking for carry forward
            temp=res.get(0);                        // in first element and creating new heads if needed
            res.set(0,temp%10);
            res.add(0,temp/10);
        }
        return res;
    }
}