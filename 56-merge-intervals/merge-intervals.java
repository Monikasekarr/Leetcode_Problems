class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        int[] current = intervals[0];
        for(int[] interval:intervals)
        {
            if(interval[0] <= current[1])
            {
                current[1] = Math.max(current[1],interval[1]);
            }
            else
            {
                list.add(current);
                current = interval;
            }
        }
        list.add(current);
        return list.toArray(new int[list.size()][]);
    }
}