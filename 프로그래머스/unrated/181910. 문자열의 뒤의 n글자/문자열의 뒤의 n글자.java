class Solution 
{
    public String solution(String my_string, int n) 
	{
		char[] result = new char[n];
		char[] strToChar = my_string.toCharArray();
		
		for(int i = 0; i < n; i++)
		{
			result[i] = strToChar[strToChar.length - n + i];
		}
		
        String answer = new String(result);
        return answer;
    }
}