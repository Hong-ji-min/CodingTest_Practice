import java.util.*;

class Solution {
    public String solution(String my_string) {
        // 정렬하는게 대소문자를 구분하기 때문에 소문자로 먼저 변환해줘야 함!
        // 문자열을 소문자로 변환 후 문자 배열로 변환
        char[] charArray = my_string.toLowerCase().toCharArray(); 
        
        // 배열 정렬
        Arrays.sort(charArray);
        
        // 정렬된 배열을 다시 문자열로 변환
        return new String(charArray); 
    
    }
}