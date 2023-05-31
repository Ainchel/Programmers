class Solution 
{
    public int solution(int[] sides) 
    {
        int Max = 0;
        int MaxIndex = -1;
        int ElseSum = 0;
        int Result = 0;
        
        for(int i = 0; i < sides.length; i++)
        	if (Max < sides[i])
            {
                Max = sides[i];
                MaxIndex = i;
            }
        
        sides[MaxIndex] = 0;
        
        for(int i = 0; i < sides.length; i++)
        	ElseSum += sides[i];
        
        if (Max < ElseSum)
        	Result = 1;
        	
        else if (Max >= ElseSum)
        	Result = 2;
        	
        int answer = Result;
        return answer;
    }
}