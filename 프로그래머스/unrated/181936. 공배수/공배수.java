class Solution 
{
    public int solution(int number, int n, int m) 
    {
        int Result = -1;
        
        if (number % n == 0 && number % m == 0)
            Result = 1;
        
        else
            Result = 0;
        
        int answer = Result;
        return answer;
    }
}