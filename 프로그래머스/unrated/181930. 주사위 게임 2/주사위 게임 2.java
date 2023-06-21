class Solution {
    public int solution(int a, int b, int c) 
	{
		int result = 0;
		
		if(a != b && b != c && a != c)
		{
			result = a + b + c;
		}
		
		else if ((a == b && a != c) || (a == c && b != c) || (b == c && a != b))
		{
			result = (a + b + c) * (a*a + b*b + c*c);
		}
		
		else
		{
			result = (a + b + c) * (a*a + b*b + c*c) * ((a*a*a) + (b*b*b) + (c*c*c));
		}
		
        int answer = result;
        return answer;
    }
}