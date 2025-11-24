class Solution {
    public String reverseWords(String s) {
        List<String> stringList = new ArrayList<>();
        s = s.trim();
        StringBuilder toTrimWhiteSpace = new StringBuilder(s);
        for (int i = 0; i < toTrimWhiteSpace.length() - 1; i++) {
            if (toTrimWhiteSpace.charAt(i) == ' ' && toTrimWhiteSpace.charAt(i + 1) == ' ') {
                toTrimWhiteSpace.deleteCharAt(i);
                i--;
            }
        }


        int sLength = toTrimWhiteSpace.length();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < sLength; i++) {
            char c = toTrimWhiteSpace.charAt(i);
            if (c != ' ') {
                temp.append(c);                 
            }
            if (c == ' ') {
                stringList.add(temp.toString());
                temp = new StringBuilder("");
            }
            if (c != ' ' && i == sLength - 1) {
                stringList.add(temp.toString());
            }
        }
        String listToString = stringList.reversed().toString();
        StringBuilder listToStringBuilder = new StringBuilder(listToString);
        listToStringBuilder.deleteCharAt(0);
        listToStringBuilder.deleteCharAt(listToStringBuilder.length() - 1);
        for (int i = 0; i < listToStringBuilder.length(); i++) {
            if (listToStringBuilder.charAt(i) == ',') {
                listToStringBuilder.deleteCharAt(i);
            }
        }
        return listToStringBuilder.toString();
    }
}
