class Solution {
   public String solution(String my_string, String alp) 
	{
		char[] strToChar = my_string.toCharArray();
		char[] alpChar = alp.toCharArray();
		
		for(int i = 0; i < strToChar.length; i++)
		{
			if(strToChar[i] == alpChar[0])
				strToChar[i] = Character.toUpperCase(alpChar[0]);
		}
		
        String answer = String.valueOf(strToChar);
        return answer;
    }
}