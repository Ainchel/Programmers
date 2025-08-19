class Solution {
    public int[] solution(int n, int k) {
        
        int arrayCount = n/k;
        int[] answer = new int[arrayCount];
        
        for(int i = 0; i < arrayCount; i++){
        answer[i] = k*(i+1);    
        }
        
        return answer;
    }
}