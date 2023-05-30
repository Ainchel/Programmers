class Solution 
{
    public int solution(int n) 
    {
    	int sum = 0;
    	
        if (0 <= n && n <= 1000)
        {
    	    while (0 < n)
            {
    		    if (n%2 == 0) // 짝수일 때
                {
    			    sum += n;
    			    n -= 2;
    		    }
                
                if (n%2 == 1)
                {
                    n -= 1;
                    sum += n;
                    n -= 2;
                    
                }
            }
        }
        
        int answer = sum;
        return answer;
    }
}