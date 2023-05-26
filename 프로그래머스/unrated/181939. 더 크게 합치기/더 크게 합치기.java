class Solution {
    public int solution(int a, int b) {
        String SumString1 = "";
        String SumString2 = "";
        int SumInt1 = 0;
        int SumInt2 = 0;
        
        int sum = 0;
        
        SumString1 = Integer.toString(a) + Integer.toString(b);
        SumString2 = Integer.toString(b) + Integer.toString(a);
        SumInt1 = Integer.parseInt(SumString1);
        SumInt2 = Integer.parseInt(SumString2);
        
        if (SumInt1 > SumInt2)
            sum = SumInt1;
        
        else if (SumInt1 < SumInt2)
            sum = SumInt2;
        
        else
            sum = SumInt1;
        
        int answer = sum;
        return answer;
    }
}