class Solution 
{
    public int solution(int n)
    {
    	int Sum = 0;
    	
    	if(n % 2 == 1) // 홀수일 때
    	{
    		while (n-2 >= -1)
    		{
    			Sum += n;
    			n -= 2;
    		}
    	}
    		
    	else if (n % 2 == 0) // 짝수일 때
    	{
    		while (n-2 >= 0)
            {
    		Sum += n*n;
            n -= 2;
            }
    	}
    	
        int answer = Sum;
        return answer;
    }
}