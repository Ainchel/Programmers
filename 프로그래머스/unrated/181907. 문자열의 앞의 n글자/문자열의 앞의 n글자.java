class Solution {
    public String solution(String my_string, int n) 
	{
		char[] strToChar = my_string.toCharArray();
		char[] result = new char[n];
		
		for(int i = 0; i < n; i++)
		{
		result[i] = strToChar[i];	
		}
		
        String answer = new String(result);
        return answer;
    }
}