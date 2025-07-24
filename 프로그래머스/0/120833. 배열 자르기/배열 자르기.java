class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int arrayCount = num2 - num1 + 1;
        int[] answer = new int[arrayCount];

        for(int i = 0; i < arrayCount; i++){
            answer[i] = numbers[i+num1];
        }
        
        return answer;
    }
}