class Solution {
    public String solution(String my_string, int num1, int num2) 
	{	
		StringBuilder result = new StringBuilder(my_string);
		char changeChar = result.charAt(num1);
		result.setCharAt(num1, result.charAt(num2));
		result.setCharAt(num2, changeChar);
		
        String answer = result.toString();
        return answer;
    }
}