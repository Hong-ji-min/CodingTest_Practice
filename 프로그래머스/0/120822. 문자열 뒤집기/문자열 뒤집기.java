class Solution {
    public String solution(String my_string) {        
        // reverse() 메소드를 제공하는 StringBuffer 클래스
        StringBuffer str = new StringBuffer(my_string);
        String answer = str.reverse().toString();

        return answer;
    }
}