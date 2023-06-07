class Solution {
  public int solution(String myString, String pat) 
	 {
		 	String MYSTRING = myString.toUpperCase();
		 	String PAT = pat.toUpperCase();
		 
		 	boolean containCheck = MYSTRING.contains(PAT);

		 	int result = -1;
		 	
		 	if(containCheck == true)
		 		result = 1;
		 	
		 	else if(containCheck == false)
		 		result = 0;
		 	
	        int answer = result;
	        return answer;
	 }
}