import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        /** 배열은 index가 0부터 시작한다는 것을 항상 명심할 것! **/
        int answer = array[array.length/2];
        return answer;
    }
}
