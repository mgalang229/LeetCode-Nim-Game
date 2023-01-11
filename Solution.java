class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0 ? true : false;
        // xxxx xxxx = lose 8
        // x xxxx xxxx = win 9
        // xx x xxx xxxx = win 10 
        // xxx x xxx xxxx = win 11
        // x xxx xxxx xxxx = win 12
    }
}
