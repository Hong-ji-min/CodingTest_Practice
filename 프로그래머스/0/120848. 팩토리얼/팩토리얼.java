class Solution {
    public int solution(int n) {
        int num = 1;
        int i = 1;
        
        while(num <= n) {
            num *= i;
            i++;
        }
        return i - 2;
    }
      
}