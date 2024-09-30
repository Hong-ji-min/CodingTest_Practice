import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                arrList.add(numlist[i]);
            }
        }
        
        // ArrayList를 Array로 바꾸줌줌
        int[] answer = arrList.stream()
                            .mapToInt(Integer::intValue)
    	                    .toArray();
        return answer;
    }
}