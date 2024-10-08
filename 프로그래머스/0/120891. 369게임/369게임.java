class Solution {
    public int solution(int order) {
        
        String num = Integer.toString(order);
        int count = 0;
        
        for(int i = 0; i < num.length(); i++) {
            char n = num.charAt(i);
            if(n =='3' || n == '6' || n == '9') {
                count++;
            }
        }
        
        return count;
    }
}