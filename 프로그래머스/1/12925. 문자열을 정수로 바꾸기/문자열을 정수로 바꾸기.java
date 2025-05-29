class Solution {
    public int solution(String s) {
        int answer = 0;
        try {
            answer = Integer.parseInt(s); 
        } catch(Exception e) {
          e.printStackTrace();  
        } finally {
            return answer;
        }
    }
}