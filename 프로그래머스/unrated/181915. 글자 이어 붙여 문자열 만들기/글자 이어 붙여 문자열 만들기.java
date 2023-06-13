class Solution {
   public String solution(String my_string, int[] index_list) 
	{
		char[] result = new char[index_list.length];
		char[] strToChar = my_string.toCharArray();
		
		for(int i = 0; i < index_list.length; i++)
		{
			result[i] = strToChar[index_list[i]];	
		}
		
        String answer = String.valueOf(result);
        return answer;
    }
}