class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder answerSB = new StringBuilder();
        StringBuilder sb = new StringBuilder(Long.toString(n));
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < sb.length(); i++){
            for(int j = 0; j < sb.length(); j++){
                if(Character.getNumericValue(sb.charAt(j)) > max){
                    max = Character.getNumericValue(sb.charAt(j));
                    maxIndex = j;
                }
            }
            
            answerSB.append((char)(max + '0'));
                    sb.setCharAt(maxIndex, '0');
                    max = 0;
                    maxIndex = 0;
            
        }
        answer = Long.parseLong(answerSB.toString());
        
        return answer;
    }
}