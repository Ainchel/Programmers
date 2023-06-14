class Solution {
    public String solution(String myString) 
	{
		String toLowerCase = myString.toLowerCase();
		char[] strToChar = toLowerCase.toCharArray();
		
		for(int i = 0; i < strToChar.length; i++)
		{
			if(strToChar[i] == 'a')
			{
				strToChar[i] = 'A';
			}	
		}
		
        String answer = String.valueOf(strToChar);
        return answer;
    }
}