class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int i = 0; i < numbers.length; i++){
            answer -= numbers[i];
        }
        
        return answer;
        
        // int count = 1;
        // for(int i = 0; i < numbers.length; i++){
        //   for(int j = 0; j < 10; j++){
        //       if(numbers[i] == j){
        //           answer += j;
        //           break;
        //       }
        //   }
        // }  
        //return answer;
    }
}