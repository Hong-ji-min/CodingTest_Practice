class Solution {
    public int solution(String my_string) {

        my_string = my_string.replaceAll("[a-zA-Z]", ""); // 문자열에서 알파벳(소문자 a-z, 대문자 A-Z)을 모두 찾아 빈 문자열 ""로 대체
        String[] arr = my_string.split(""); // 숫자로만 남은 문자열을 한 글자씩 쪼개어 문자열 배열 arr에 저장
                
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
		answer += Integer.valueOf(arr[i]); 
	}
        return answer;
    }
}
