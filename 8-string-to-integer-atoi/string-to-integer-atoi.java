class Solution {
    public int myAtoi(String s) {
        int index = 0;
        while(index < s.length() && s.charAt(index) == ' ')
        {
            index++;
        }
        if(index == s.length())
        {
          return 0;
        }
        int sign = 1;
        if(s.charAt(index) == '-' || s.charAt(index) == '+')
        {
            if(s.charAt(index) == '-')
            {
                sign = -1;
            }
            index++;
        }
        long result = 0;
        while(index < s.length() && Character.isDigit(s.charAt(index)))
        {
            int digit = s.charAt(index) - '0';
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit > 7))
            {
                return(sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            if(result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && digit > 8))
            {
                return(sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result*10+digit;
            index++;
        }
        return(int) result*sign;
    }
}