class Solution {
    public int solution(int n) {
        double num = Math.sqrt(n);
        
        int answer = (num % 1 == 0) ? 1 : 2;
        return answer;
    }
}