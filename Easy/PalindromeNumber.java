class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        while(x > 0){
            int rem = x % 10;
            rev=rev*10+rem;
            x /= 10;
        }
        return org==rev;
    }
}
