class Solution {
    public int[] solution(int start_num, int end_num) {
        int arrayCount = start_num-end_num+1;
        int[] answer = new int[arrayCount];
        
        for(int i = 0; i < arrayCount; i++){
            answer[i] = start_num-i;
        }
        
        return answer;
    }
}