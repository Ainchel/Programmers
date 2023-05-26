class Solution {
    public int solution(int a, int b) {
        int CountA = 2 * a * b;
        String IntToStr = Integer.toString(a) + Integer.toString(b);
        int StrToInt = Integer.parseInt(IntToStr);
        int sum = 0;

        if (CountA > StrToInt)
        	sum = CountA;
        
        else if (CountA > StrToInt)
        	sum = StrToInt;
        
        else
        	sum = StrToInt;
        
        int answer = sum;
        return answer;
    }
}