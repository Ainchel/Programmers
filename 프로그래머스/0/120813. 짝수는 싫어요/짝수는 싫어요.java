class Solution {
    public int[] solution(int n) {
        
        int arrayCount = 0;
        
        if(n % 2 == 0) arrayCount = n / 2;
        else arrayCount = (n/2) + 1;
        
        int[] answer = new int[arrayCount];
        
        for(int i = 0; i < arrayCount; i++){
            answer[i] = 2*(i+1) - 1;
        }
        
        return answer;
    }
}