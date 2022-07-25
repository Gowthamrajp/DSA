https://leetcode.com/problems/find-pivot-index/

Bruteforce solution 

for each element iterate the rest of the array to find the right sum and chech if left sum = right sum 
this take O(n2) complexity 

better solution 

Find sum of the array using for loop and use another for loop to find left sum and simultaneously 
chck for equality with right sum which is sum-element-left sum .abstract

this takes O(N) complexity
