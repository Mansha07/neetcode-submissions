class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}

// int min = strs.length == 0 ? 0 : Integer.MAX_VALUE;
// ArrayList<String> ans = new ArrayList<>();
// for (String s : strs) {
//     if (s.length() < min) {
//         min = s.length();
//     }
// }
// int j;
// String result = "";
// for (int i = 0; i < min; i++) {
//     j = 0;
//     while (j < strs.length - 1) {
//         if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
//             j++;
//             continue;
//         } else {
//             break;
//         }
//     }
//     if (j == strs.length - 1) {
//         result += strs[0].charAt(i);
//     }
//     if (j < strs.length - 1) {
//         break;
//     }
// }
// return result;
