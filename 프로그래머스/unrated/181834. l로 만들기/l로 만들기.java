class Solution {
  public String solution(String myString) 
	 {
		 	StringBuilder sb = new StringBuilder(myString);
		 	
		 	for(int i = 0; i < sb.length(); i++)
		 	{
		 		if(sb.charAt(i) - 108 < 0)
		 		{
		 			sb.setCharAt(i, 'l');
		 		}
		 	}
		 
	        String answer = sb.toString();
	        return answer;
	 }
}