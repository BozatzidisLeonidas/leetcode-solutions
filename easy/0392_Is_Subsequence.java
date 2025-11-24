class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t) || s.isEmpty()) return true;

        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        int counter = 0;
        for (int i = 0; i < t.length(); i++) {

            if(t.charAt(i) == chars[counter]) {
                    counter++;
                    if(counter == chars.length) break;
            }
        }
        return counter == chars.length;
    }
}
