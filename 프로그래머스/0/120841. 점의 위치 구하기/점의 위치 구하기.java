class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        /** x축이 양수일 때 **/
        if(dot[0] > 0) {
            if(dot[1] > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
            
        } 
        /** x축이 음수일 때 **/
        else if (dot[0] < 0) {
            if(dot[1] > 0) {
                answer = 2;
            } else {
                answer = 3;
            }
        }
        
        return answer;
    }
}