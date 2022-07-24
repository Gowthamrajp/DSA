1491. Average Salary Excluding the Minimum and Maximum Salary 
    
OPTIMISED
use 1 for loop and find MIN , MAX and SUM and use formula for excluded average and return
Dont forget to type cast int to DOuble before returning. 

class Solution {
    public double average(int[] salary) {
        int max=999; int min=1000001; int sum=0; 
         for(int i=0;i<salary.length;i++)
         {
             sum+=salary[i];
             min=salary[i]<min?salary[i]:min ;
             max=salary[i]>max?salary[i]:max ;

         }
        return (double)(sum-max-min)/(double)(salary.length-2.0);
    }
}
