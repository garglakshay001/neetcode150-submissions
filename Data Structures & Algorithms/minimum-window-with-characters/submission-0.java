class Solution {
    public String minWindow(String s, String t) {
        
        int n = s.length();
        int minLen = Integer.MAX_VALUE;

        int sIndex = -1;

        for (int i = 0; i < n;i++) {

            int[] hash = new int[256];
            for (char c : t.toCharArray()) {
                hash[c]++;

            }
            int count = 0;

            for (int j = i; j < n; j++) {
                if (hash[s.charAt(j)] > 0) {
                    count++;
                }
                hash[s.charAt(j)]--;

                if (count == t.length()) {

                    if (j - i + 1 < minLen) {
                        minLen = j - i + 1;
                        sIndex = i;
                    }
                    break;
                }
            }
        }
        return (sIndex == -1) ? "" : s.substring(sIndex, sIndex + minLen);
    }
}
