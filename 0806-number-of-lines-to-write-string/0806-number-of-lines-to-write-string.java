class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int res = 1, cur = 0;

        for (char c : S.toCharArray()) {
            int width = widths[c - 'a'];

            if (cur + width > 100) {
                res++;
                cur = width;
            } else {
                cur += width;
            }
        }

        return new int[] {res, cur};
    }
}