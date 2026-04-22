class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String word : strs) {
            result.append(word.length());
            result.append("#");
            result.append(word);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);

            String lenStr = str.substring(i, j);
            int len = Integer.parseInt(lenStr);

            String word = str.substring(j + 1, j + 1 + len);
            result.add(word);

            i = j + 1 + len;
        }
        return result;
    }
}