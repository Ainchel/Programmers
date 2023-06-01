class Solution 
{
    public String solution(String my_string) 
    {
		char[] Direct = my_string.toCharArray();
		
		char[] Reverse = new char[my_string.length()];
		
        for(int i = 0; i < my_string.length(); i++)
        	Reverse[i] = Direct[my_string.length() - i - 1];
        
        String answer = String.valueOf(Reverse);
        return answer;
    }
}