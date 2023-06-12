class Solution {
  public int solution(int n, String control) 
	 {
		 char[] strToChar = control.toCharArray();
		 int result = n;
		 
		 for(int i = 0; i < strToChar.length; i++)
		 {
			 if (strToChar[i] == 'w')
				 result += 1;
			 
			 else if (strToChar[i] == 's')
				 result -= 1;
			 
			 else if (strToChar[i] == 'd')
				 result += 10;
			 
			 else if (strToChar[i] == 'a')
				 result -= 10;
		 }
		 
		 int answer = result;
		 return answer;
	 }
}