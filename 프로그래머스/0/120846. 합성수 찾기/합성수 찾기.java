class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            // 약수의 개수 구하는 변수
            int divisor_num = 0;
            for(int j = 1; j <= i; j++) {
                divisor_num += (i % j == 0) ? 1 : 0;
            }
            
            // 약수의 개수가 3개 이상인 수 개수 세기
            answer += (divisor_num >= 3) ? 1 : 0;
        }
        return answer;
    }
}