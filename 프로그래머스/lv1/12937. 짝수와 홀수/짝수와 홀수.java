class Solution {
    public String solution(int num) {
        String answer = "";
        
        if(num >= 0){
            if(num % 2 == 1) //홀수일 때
                answer = "Odd";
        
            else if(num % 2 == 0) // 짝수일 때
                answer = "Even";
        }
        
        else if(num < 0){
            
            if(Math.abs(num) % 2 == 1) // 음수 홀수일 때 - 절대값 변환
                answer = "Odd";
                
            else if(Math.abs(num) % 2 == 0) // 음수 짝수일 때 - 절대값 변환
                answer = "Even";
        }
        
        return answer;
        
    }
    
}