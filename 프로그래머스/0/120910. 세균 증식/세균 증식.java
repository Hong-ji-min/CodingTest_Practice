class Solution {
    public int solution(int n, int t) {
        int result = n;
        for (int num = 0; num < t; num ++) {
            result *= 2;
        }
        return result;
    }
}