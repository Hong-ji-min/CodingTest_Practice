/** 내 답안 **/
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2) {
            answer = 1;
        }
        else {
            answer = -1;
        }
        return answer;
    }
}


/** 모범 답안 **/
/** if문 보다는 삼항연산자로 간단하게 해결할 수 있음 **/
class Solution {
    public int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }
}
