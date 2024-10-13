class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String [] split = my_string.split(" ");
        
        for(int i = 1; i < split.length; i++) {
            if(split[i].equals("+")) {
                answer += Integer.parseInt(split[i + 1]);
            }
            else if(split[i].equals("-")) {
                answer -= Integer.parseInt(split[i + 1]);
            }
        }
        answer += Integer.parseInt(split[0]);
        
        return answer;
    }
}