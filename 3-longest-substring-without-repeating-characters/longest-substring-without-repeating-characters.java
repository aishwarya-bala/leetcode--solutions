class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        int start = 0;
        for(int end = 0; end < s.length(); end++)
        {
            for(int i = start; i < end; i++)
            {
                if(s.charAt(i) == s.charAt(end))
                {
                    start = i+1;
                    break;
                }
            }
            maxlength = Math.max(maxlength,end - start + 1);

        }
        return maxlength;
    }
}