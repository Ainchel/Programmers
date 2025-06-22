class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                System.out.println((int)s.charAt(i));
                if((int)s.charAt(i) >= 58){
                    answer = false;
                }
            }
        } else {
            return false;
        }
        
        return answer;
    }
}