1886. Determine Whether Matrix Can Be Obtained By Rotation - https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            transpose(mat);
            swap(mat);
            if(check(mat,target))
                return true;   
        }
        return false;
    }
    public void transpose(int[][] mat){
        int temp=0;
        for(int i=0;i<mat.length;i++)
            for(int j=i+1;j<mat.length;j++){
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
    }
    public void swap(int[][] mat){
        int temp=0;
        for(int i=0;i<mat.length;i++)
            for(int j=0;j<mat.length/2;j++){
                temp=mat[i][mat.length-1-j];
                mat[i][mat.length-1-j]=mat[i][j];
                mat[i][j]=temp;
            }
        
    }
    public boolean check(int[][] mat, int[][] target){
        for(int i=0;i<mat.length;i++)
            for(int j=0;j<mat.length;j++)
                if(mat[i][j]!=target[i][j])
                    return false;
        return true;
    }
}

TC - O(N2)
SC - O(1)