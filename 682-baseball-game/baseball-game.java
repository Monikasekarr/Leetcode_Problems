class Solution {
    public int calPoints(String[] operations) {
       // Stack<Integer> st = new Stack<>();
       int record[] = new int[operations.length];
       int m =0;
        for(String op: operations)
        {
            if(op.equals("+"))
            {
                record[m] = record[m-1] + record[m-2];
                m++;
            }
            else if(op.equals("D"))
            {
                record[m] = 2* record[m-1];
                m++;
            }
            else if(op.equals("C"))
            {
                record[m] = 0;
                m--;
            }
            else
            {
              record[m] = Integer.parseInt(op);
              m++;
            }
        }
        int sum = 0;
        for(int i=0;i<m;i++)
           sum += record[i];
        return sum;
    }
}