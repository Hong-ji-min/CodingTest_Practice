class Solution {
    public int solution(int hp) {
        int answer = 0;
        int remainder = 0;
        
        answer += hp / 5;
        remainder = hp % 5;
        
        answer += remainder / 3;
        remainder = remainder % 3;
        
        answer += remainder;
        
        return answer;
    }
}