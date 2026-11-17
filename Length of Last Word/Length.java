class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int lastWord = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (count == 0) {
                    continue;
                }

                lastWord = count;
                count = 0;
                continue;
            }

            count++;
        }

        if (count == 0) {
            return lastWord;
        }

        return count;
    }
}