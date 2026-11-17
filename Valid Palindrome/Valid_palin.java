class Solution {
    public boolean isPalindrome(String s) {

        boolean result = true;

        s = s.toLowerCase();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {

                if (!Character.isLetterOrDigit(s.charAt(start))) {
                    start++;
                    continue;

                } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                    end--;
                    continue;

                } else {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}