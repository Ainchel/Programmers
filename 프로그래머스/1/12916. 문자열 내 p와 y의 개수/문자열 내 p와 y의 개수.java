class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') pCount++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') yCount++;
        }
        
        if (pCount == yCount) answer = true;
            else answer = false;
        
        if (pCount == 0 && yCount == 0) answer = true;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        return answer;
    }
}