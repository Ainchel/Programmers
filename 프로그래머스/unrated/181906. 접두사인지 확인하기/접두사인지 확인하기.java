class Solution {
    public int solution(String my_string, String is_prefix) 
	{
		int result = -1;
		
		if(my_string.startsWith(is_prefix) == true)
			result = 1;
		
		else
			result = 0;
		
        int answer = result;
        return answer;
    }
}