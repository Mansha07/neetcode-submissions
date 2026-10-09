class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs.length == 0 ? 0 : Integer.MAX_VALUE;
        ArrayList<String> ans = new ArrayList<>();
        for (String s : strs) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        int j;
        String result = "";
        for (int i = 0; i < min; i++) {
            j = 0;
            while (j < strs.length - 1) {
                if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                    j++;
                    continue;
                } else {
                    break;
                }
            }
            if (j == strs.length - 1) {
                result += strs[0].charAt(i);
            }
            if (j < strs.length - 1) {
                break;
            }
        }
        return result;
    }
}