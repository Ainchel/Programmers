class Solution {
    public String solution(String cipher, int code) 
	{
		int indexCount = cipher.length() / code;
		char[] cipherToChar = cipher.toCharArray();
		char[] result = new char[indexCount];
		
		for(int i = 0; i < result.length; i++)
		{
			result[i] = cipherToChar[(code*(i + 1)) - 1];
		}
		
        String answer = String.valueOf(result);
        return answer;
    }
}