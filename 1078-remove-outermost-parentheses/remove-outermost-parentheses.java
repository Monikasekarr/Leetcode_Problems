class Solution {
    public String removeOuterParentheses(String s) {
        int ocount = 0;
        int ccount = 0;
        int index = 0;
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
               ocount++;
            else
               ccount++;
            if(ocount == ccount)
            {
                ans += s.substring(index+1,i);
                index = i+1;
            }
        }
        return ans;
    }
}