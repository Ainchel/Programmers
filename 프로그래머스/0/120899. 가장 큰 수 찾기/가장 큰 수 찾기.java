class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxCount = -1;
        int maxValue = -1;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
                maxCount = i;
            }
        }
        
        answer[0] = maxValue;
        answer[1] = maxCount;
        
        return answer;
    }
}