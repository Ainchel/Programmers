class Solution {
    public int solution(int left, int right) {
        
        int answer = 0;
        int devide = 0;
        int devideCount = 0;
        
        for(int i = left; i <= right; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    devideCount++;
                }   
            }
            
            if(devideCount % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
            
            devideCount = 0;
        }
        
        return answer;
    }
}