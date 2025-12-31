class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }
        int reversedNum = 0;
        int xCopy = x;
        while(xCopy > 0)
        {
            int rem = xCopy % 10;
            reversedNum = reversedNum*10+rem;
            xCopy/=10;

        }
        return reversedNum == x;
    }
}