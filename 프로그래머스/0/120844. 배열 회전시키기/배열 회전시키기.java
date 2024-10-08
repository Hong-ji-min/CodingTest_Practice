class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        switch(direction) {
            case "left" : 
                answer = left(numbers);
                break;
            case "right" : 
                answer = right(numbers);
                break;
        }
        return answer;
    }
    
    public static int[] left(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 1; i <= numbers.length - 1; i++) {
            answer[i - 1] = numbers[i];
        }
        answer[numbers.length - 1] = numbers[0];
        return answer;
    }
    
    public static int[] right(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i = 1; i < numbers.length; i++) {
            answer[i] = numbers[i - 1];
        }
        answer[0] = numbers[numbers.length - 1];
        return answer;
    }
}