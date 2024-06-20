class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1, r = position[position.length-1] - position[0];
        int ans = 1;
        while(l <= r)
        {
            int mid = l+(r-l)/2;

            if(con(mid,position,m))
              {
                  ans = mid;
                  l = mid +1;
              }
            else
              r = mid -1;
        }
        return ans;
    }
    public static boolean con(int mid,int pos[],int m)
    {
        int ball = 1;
        int p = pos[0];
        for(int i=0;i<pos.length;i++)
        {
             if(pos[i] - p >= mid)
              {
                  ball++;
                  p = pos[i];
              }   
            if(ball >= m) {return true;}
        }
          return false;
    }
}