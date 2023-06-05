class Solution {
    public int solution(String my_string) 
	{
		char[] toChar = my_string.toCharArray();
		int charToInt = 0;
		int result = 0;
		
		for(int i = 0; i < toChar.length; i++)
		{
			charToInt = (int)toChar[i] - 48;
			if(0 < charToInt && charToInt < 10)
				
			result += charToInt;	
		}
		
        int answer = result;
        return answer;
    }
}