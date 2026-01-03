class Solution {
    public int romanToInt(String s) {
        int total = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int value = getValue(s.charAt(i));
            if(i + 1 < s.length() && value < getValue(s.charAt(i + 1)))
            {
                total = total - value;
            }
            else
            {
                total = total + value;
            }
        }
        return total;
    }
    int getValue(char c)
    {
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        if(c == 'M') return 1000;
        return 0;
    }
}