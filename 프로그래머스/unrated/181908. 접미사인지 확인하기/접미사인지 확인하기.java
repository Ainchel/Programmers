class Solution 
{
    public int solution(String my_string, String is_suffix) 
	{
		boolean isSuffix;
		int result = -1;
		
		if(my_string.endsWith(is_suffix) == true)
			result = 1;
		
		else result = 0;
		
        int answer = result;
        return answer;
    }
}