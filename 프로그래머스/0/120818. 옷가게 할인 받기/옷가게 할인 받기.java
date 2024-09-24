import java.util.*;

class Solution {
    public int solution(int price) {
        if(price >= 500000) {
            price *= 0.8;
        } else if(price >= 300000) {
            price *= 0.9;
        } else if(price >= 100000) {
            price *= 0.95;
        }
        return price;
    }
}

/** 정답률이 85% 인 답 **/
/** 🚨반례를 찾아보기🚨 **/
import java.util.*;

class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >= 500000) {
            answer = (int) (price * 0.8);
        }
        else if (price >= 300000) {
            answer = (int) (price * 0.9);
        }
        else if (price >= 10000) {
            answer = (int) (price * 0.95);   
        }
        else {
            answer = price;

        }
        return answer;
    }
}
