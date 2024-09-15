/** 내 답안 **/
class Solution {
    public int solution(int n) {
        int result = 0;
        int num = 0;
        
        while(num <= n){
            result += num;
            num += 2;
        }
        return result;
    }
}


/** 모범 답안 **/
class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }
}
