class Solution {
 public int solution(int a, int b) 
	{
		int result = 0;
		
		if(a % 2 == 1 && b % 2 == 1)
		{
			result = a*a + b*b;
		}
		
		else if(a % 2 == 1 || b % 2 == 1)
		{
			result = 2 * (a + b);
		}
		
		else if(a % 2 == 0 && b % 2 == 0)
		{
			result =Math.abs(a-b);
		}
		
        int answer = result;
        return answer;
    }
}