class Solution {
    public boolean isAnagram(String s, String t) {
        int length1 = s.length();
        int length2 = t.length();

        if (length1 != length2) return false;

        boolean[] visited = new boolean[length2]; // marks used characters in t

        for (int i = 0; i < length1; i++) {
            char c = s.charAt(i);
            boolean found = false;

            for (int j = 0; j < length2; j++) {
                if (!visited[j] && c == t.charAt(j)) {
                    visited[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found) return false; // unmatched character
        }

        return true; // all characters matched
    }
}
