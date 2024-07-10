class Solution {
    public int[][] transpose(int[][] mat)
    {
        int n = mat.length;
        int m = mat[0].length;
        int arr[][] = new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               arr[j][n-i-1] = mat[i][j];
            }
        }
        return arr;
    }
    public boolean check(int[][] arr,int[][] target)
    {
        int k = target.length;
        int l = target[0].length;
        if(arr.length!=k || arr[0].length!=l)
           return false;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(arr[i][j] != target[i][j])
                   return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
       for(int i=0;i<4;i++)
       {
        int arr[][] = transpose(mat);
        if(check(arr,target))
           return true;
        mat = arr;
       }
       return false;
    }
}