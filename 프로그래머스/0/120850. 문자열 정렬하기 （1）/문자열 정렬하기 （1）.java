import java.util.*;

class Solution {
    public int[] solution(String my_string) {        
        // 숫자만 추출하기
        String int_num = my_string.replaceAll("[^0-9]", "");
        
        
        // int를 담을 배열 준비
        int[] answer = new int[int_num.length()];
        
        // 배열에 담기
        for(int i = 0; i < int_num.length(); i++){
            answer[i] = int_num.charAt(i) - '0';
        } 
        Arrays.sort(answer);
        
        return answer;
    }
}