class Solution 
{
    public int solution(int n) 
    {
        int Count = 0;
        
        for(int i = 1; i <= n; i++)
        	if(n % i == 0)
        		Count++;
		
        int answer = Count;
        return answer;
    }
}