class Solution {
    public int solution(int slice, int n) 
	{
		int Result = 0;
		
		if(n % slice == 0)
			Result = n / slice;
		
		else if(n % slice != 0)
			Result = (n / slice) + 1;
		
		
        int answer = Result;
        return answer;
    }
}