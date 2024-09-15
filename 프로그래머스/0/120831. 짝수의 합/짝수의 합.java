class Solution {
    public int solution(int n) {
        int result = 0;
        int num = 0;
        
        while(num <= n){
            result += num;
            num += 2;
        }
        return result;
    }
}