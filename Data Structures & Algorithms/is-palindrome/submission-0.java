class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        s=s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int n = s.length() - 1;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(n-i)){
                return false;
            }
        }
        return true;
    }
}
