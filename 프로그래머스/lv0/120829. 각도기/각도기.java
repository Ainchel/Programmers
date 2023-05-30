class Solution 
{
    public int solution(int angle) 
    {
    	int Result = 0;
    	
    	if (0 < angle && angle < 90)
    		Result = 1;
    	
    	else if (angle == 90)
    		Result = 2;
    	
    	else if (90 < angle && angle < 180)
    		Result = 3;
    	
    	else if (angle == 180)
    		Result = 4;
    	
        int answer = Result;
        return answer;
    }
}