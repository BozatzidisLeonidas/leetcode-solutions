class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character, Integer> magazineLetters = new HashMap<>();
        int magazineLength = magazine.length();
        int ransomLength = ransomNote.length();

        for (int i = 0; i < magazineLength; i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, currentCount + 1);
        }

        for (int i = 0; i < ransomLength; i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r, 0);

            if (currentCount == 0) {
                return false;
            }

            magazineLetters.put(r, currentCount - 1);
        }
            return true;
    }
}
