class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b){
            answer = a;
        } else if(a > b){
            for(int i = b+1; i < a; i++){
                answer += i;
            }
            answer += a + b;
        } else if(b > a){
            for(int i = a+1; i < b; i++){
                answer += i;
            }
            answer += a + b;
        }
        return answer;
    }
}