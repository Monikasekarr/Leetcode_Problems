class Solution {
    public int longestPalindrome(String s) {
        int freq[] = new int[128];

        for(char ch : s.toCharArray())
        {
            freq[ch]++;
        }

        int res = 0;

        for(int i: freq)
        {
              res = res + i/2*2;
        }
        
        if(res < s.length())
          res++;
          
        return res;
    }
}