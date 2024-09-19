/** 내 답안 **/
import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        double answer = (double)sum / numbers.length;
        return answer;
    }
}

/** 모범답안 **/
import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
