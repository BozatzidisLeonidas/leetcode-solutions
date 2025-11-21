class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        String sb = new StringBuilder(y).reverse().toString();
        return y.equals(sb) ? true : false;
    }
}
