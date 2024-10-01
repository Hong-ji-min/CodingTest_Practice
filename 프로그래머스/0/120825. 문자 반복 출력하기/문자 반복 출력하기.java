class Solution {
    public String solution(String my_string, int n) {
        String [] string = my_string.split("");
        String result = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            result += string[i].repeat(n);
        }
                 
        return result;
    }
}