class Solution {
    public String solution(String my_string) 
	{
		StringBuilder result = new StringBuilder(my_string);
		char resultChar;
		
		for(int i = 0; i < result.length(); i++)
		{
			resultChar = result.charAt(i);
			
			if(Character.isUpperCase(resultChar) == true)
				{
				result.setCharAt(i, Character.toLowerCase(resultChar));
				}
			else
				{
				result.setCharAt(i, Character.toUpperCase(resultChar));
				}
		}
		
        String answer = result.toString();
        return answer;
    }
}