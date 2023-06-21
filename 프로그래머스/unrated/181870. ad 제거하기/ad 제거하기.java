class Solution {
    public String[] solution(String[] strArr)
	{
		int resultLength = strArr.length;
		int resultIdx = 0;
		
		for(int i = 0; i < strArr.length; i++)
		{
			if(strArr[i].contains("ad")) {resultLength--;}
		}
		
		String result[] = new String[resultLength];
		
		for(int i = 0; i < strArr.length; i++)
		{
			if(!strArr[i].contains("ad"))
			{
				result[resultIdx] = strArr[i];
				resultIdx++;
			}
		}
		
		String[] answer = result;
		return answer;
		
    }
}