class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0) return 0;

        int write = 0;
        int counter = 1;

        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                counter++;
            } else {
                chars[write++] = chars[i - 1];

                if (counter > 1) {
                    for (char c : Integer.toString(counter).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                counter = 1; 
            }
        }

        return write; 
    }
}
