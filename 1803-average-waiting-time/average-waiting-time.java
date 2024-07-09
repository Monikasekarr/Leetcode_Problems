class Solution {
    public double averageWaitingTime(int[][] customers) {
        double time = 0.0;
        int n = customers.length;
        int idleTime = 0;
        long w =0;
        for(int i=0;i<n;i++)
        {
             idleTime = Math.max(customers[i][0],idleTime) + customers[i][1];
             w += idleTime - customers[i][0];
        }
        time = (double) w/n;
        return time;
    }
}