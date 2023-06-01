class Solution {
    public int solution(int[] dot) 
	{
		int Result = -1;
		
		if(0 < dot[0] && 0 < dot[1])
			Result = 1;
		
		else if (dot[0] < 0 && 0 < dot[1])
			Result = 2;
		
		else if (dot[0] < 0 && dot[1] < 0)
			Result = 3;
		
		else if (0 < dot[0] && dot[1] < 0)
			Result = 4;
		
        int answer = Result;
        return answer;
    }
}