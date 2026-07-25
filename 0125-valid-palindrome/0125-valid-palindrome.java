class Solution {
    public boolean isPalindrome(String s) {

        String n = "";


        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                n += Character.toLowerCase(s.charAt(i));
            }
        }

        String reversed = "";


        for (int i = n.length() - 1; i >= 0; i--) {
            reversed += n.charAt(i);
        }

        if (n.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}