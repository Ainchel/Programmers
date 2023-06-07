class Solution {
   public int solution(String num_str) 
	{
		char[] num_char = num_str.toCharArray();
		int result = 0;
		
		for(int i = 0; i < num_char.length; i++)
		{
			result += Character.getNumericValue(num_char[i]);
		}
		
        int answer = result;
        return answer;
    }
}