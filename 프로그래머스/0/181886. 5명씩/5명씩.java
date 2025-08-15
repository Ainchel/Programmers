class Solution {
    public String[] solution(String[] names) {
        int arrayCount = 0;
        
        if(names.length % 5 == 0) arrayCount = names.length / 5;
        else arrayCount = (names.length / 5) + 1;
        
        String[] answer = new String[arrayCount];
        
        for(int i = 0; i < arrayCount; i++){
            answer[i] = names[5*i];
        }
        
        return answer;
    }
}