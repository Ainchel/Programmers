class Solution 
{
    public int solution(int a, int b, boolean flag) 
    {
    	int sum = 0;
    	
    	if (flag == true)
    		sum = a + b;
    	
    	else if (flag == false)
    		sum = a - b;
    		
        int answer = sum;
        return answer;
    }
}