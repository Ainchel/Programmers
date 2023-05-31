class Solution {
   public String solution(String my_string, String letter) 
	{
		StringBuilder a = new StringBuilder(my_string);
		char[] b = letter.toCharArray();
		
		for(int i = 0; i < a.length(); i++)
		{
			if(a.charAt(i) == b[0])
			{
				a.deleteCharAt(i);
				i--;
			}
		}
		
        String answer = a.toString();
        return answer;
    }
}