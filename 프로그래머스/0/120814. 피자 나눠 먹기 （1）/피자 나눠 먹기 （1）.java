/** 내 답안 **/
class Solution {
    public int solution(int n) {
        int answer = 0;

        if(n % 7 == 0) {
            answer = n / 7;
        }
        else {
            answer = n / 7 + 1;
        }
        return answer;
    }
}

/** 모범 답안 **/
/** 나머지가 0 ~6만 나온다는 성질 이용 **/
class Solution {
    public int solution(int n) {
        return (n + 6) / 7;
    }
}
