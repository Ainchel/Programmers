class Solution 
{
    public int solution(int n) 
    {
        int Result = 0;
        
        if(n <= 7) 
            Result = 1;
        
        if(n % 7 == 0)
            Result = n / 7;
        
        else if (n > 7)
            Result = (int)(n/7) + 1;
        
        int answer = Result;
        return answer;
    }
}