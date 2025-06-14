import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
             list.add(arr[i]);   
            }
        }    
        
        //String[ ] names = { “혼공자”, “혼공족장”, “자바맨” };
        if(list.size() == 0) return new int[] {-1};
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] =list.get(i).intValue();
        }

        Arrays.sort(answer);
        return answer;
    }
}