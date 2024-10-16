class Solution {
    public String solution(String letter) {
        // append 함수를 쓰기 위함
        StringBuilder sb = new StringBuilder();

        String [] arr = {
            ".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-",
            "...-",".--","-..-","-.--","--.."
            };
        
        // 공백으로 모스부호를 구분하므로 공백 기준으로 split
        String[] sArr = letter.split(" ");

        int j = 0;
        for(String s : sArr) {
            for(int i = 0; i < arr.length; i++) {
                if(s.equals(arr[i])) {
                    sb.append((char) (97 + i));
                    break;
                }
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}