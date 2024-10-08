class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String num_str = Integer.toString(num);
        char k_char = Integer.toString(k).charAt(0);
        
        for (int i = 0; i < num_str.length(); i++) {
            if(num_str.charAt(i) == k_char){
                answer = i + 1;
                break;
            }
        }
        
        if(answer == 0) {
            return -1;
        }
        else {
            return answer;
        }
        
    }
}