class Solution {
    public String solution(String n_str) 
	{
		StringBuilder sb = new StringBuilder(n_str);
		
		for(int i = 0; i < sb.length(); i++)
		{
			if(sb.charAt(0) == '0')
			{
					sb.deleteCharAt(i);
					i--;
			}
			
			else break;
		}
        String answer = sb.toString();
        return answer;
    }
}