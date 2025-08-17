class Solution {
    public int[] solution(int[] num_list) {
        int arrayCount = num_list.length+1;
        
        int[] answer = new int[arrayCount];
        
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        if(num_list[num_list.length-1] > num_list[num_list.length-2]){
            answer[answer.length-1] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else{
            answer[answer.length-1] = num_list[num_list.length-1] * 2;
        }
        
        return answer;
    }
}