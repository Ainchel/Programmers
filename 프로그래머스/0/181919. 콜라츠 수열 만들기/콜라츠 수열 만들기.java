class Solution {
    public int[] solution(int n) {
        
        int arrayCount = 1;
        int saveN = n;
        
        while(saveN != 1){
            if(saveN % 2 == 0){
                saveN /= 2;
                arrayCount++;
            } else {
              saveN = (saveN*3)+1;
                arrayCount++;
            }
        }
        
        int[] answer = new int[arrayCount];
        
        answer[0] = n;
        
        for(int i = 1; i < arrayCount; i++){
            if(n % 2 == 0){
                n /= 2;
                answer[i] = n;
            } else{
                n = (n*3) + 1;
                answer[i] = n;
            }
        }
        
        return answer;
    }
}