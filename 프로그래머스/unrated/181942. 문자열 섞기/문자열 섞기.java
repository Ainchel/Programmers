class Solution 
{
    public String solution(String str1, String str2) 
    {
        String strSum = "";
        char[] str1Array = str1.toCharArray();
	    char[] str2Array = str2.toCharArray();
        
        if(str1.length() == str2.length())
	        if(1 <= str1.length() && str1.length() <= 10)
	        {
	        	for(int i = 0; i <= str1.length() - 1; i++)
	        	{
	        			strSum += str1Array[i];
	        			strSum += str2Array[i];
	        	}
	        }
        
	    String answer = strSum;
        return answer;
    }
}