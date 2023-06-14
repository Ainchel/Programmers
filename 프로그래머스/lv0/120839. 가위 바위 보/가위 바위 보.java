class Solution {
    public String solution(String rsp) 
	{
		char[] rspToChar = rsp.toCharArray();
		char[] result = new char[rspToChar.length];
		
		for(int i = 0; i < rspToChar.length; i++)
		{
			if(rspToChar[i] == '2') result[i] = '0';
			else if(rspToChar[i] == '0') result[i] = '5';
			else if(rspToChar[i] == '5') result[i] = '2';
		}
		
        String answer = String.valueOf(result);
        return answer;
    }
}