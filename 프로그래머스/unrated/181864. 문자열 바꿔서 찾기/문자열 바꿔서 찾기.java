class Solution {
   public int solution(String myString, String pat) 
	 {
		 	boolean containCheck;
		 	int result = -1;
		 	String charToStr;
		 	char[] strToChar = myString.toCharArray();
		 	
		 	for(int i = 0; i < strToChar.length; i++)
		 	{
		 		if(strToChar[i] == 'A') strToChar[i] = 'B';
		 		
		 		else if (strToChar[i] == 'B') strToChar[i] = 'A';
		 	}
		 	
		 	charToStr = String.valueOf(strToChar);
		 	
		 	if(charToStr.contains(pat) == true) result = 1;
		 	
		 	else result = 0;
		 	
	        int answer = result;
	        return answer;
	 }
}