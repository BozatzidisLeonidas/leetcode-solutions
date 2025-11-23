class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int i = 0;
        int j = s.length()-1;
        char[] stringAsChar = s.toCharArray();

        while(i<j) {
            while(i < j && !vowels.contains(stringAsChar[i])) {
                i++;
            }

            while(i < j && !vowels.contains(stringAsChar[j])) {
                j--;
            }
            char temp = stringAsChar[i];
            stringAsChar[i] = stringAsChar[j];
            stringAsChar[j] = temp;
            i++;
            j--;
        }
        return new String(stringAsChar);
    }
}
