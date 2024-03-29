class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int i=0;i<tickets.length;i++)
        {
            q.offer(i);
        }
        while(!q.isEmpty())
        {
            ++count;
            int front = q.poll();
            if(tickets[front] >= 1)
               tickets[front] -=1;
            if(tickets[front] ==0 && k == front)
                break;
            if(tickets[front] == 0 && k!=front)
               continue;
            q.add(front);
        } 
        return count;
    }
}