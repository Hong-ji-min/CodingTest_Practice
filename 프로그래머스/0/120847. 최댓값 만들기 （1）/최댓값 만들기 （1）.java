import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
                
        int firstIndex = numbers[numbers.length- 1];
        int secondIndex = numbers[numbers.length- 2];
        
        int answer = firstIndex * secondIndex;

        return answer;
    }
}