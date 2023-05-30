class Solution 
{
    public int solution(int num1, int num2) 
    {
        double DevideValue = (double)num1 / (double)num2;
        double Result = DevideValue * 1000;
        
        int answer = (int)Result;
        return answer;
    }
}