class Solution {
    public String[] solution(String my_string) 
	{
		String[] splitStr = my_string.split(" ");
		int countMinus = 0;
		int indexCount = 0;
		
		for(int i = 0; i < splitStr.length; i++)
		{
			if(splitStr[i].equals(""))
				countMinus ++;
		}
		
		String[] result = new String[splitStr.length - countMinus];
		
		for(int i = 0; i < splitStr.length; i++)
		{
			if(!splitStr[i].equals(""))
			{
				result[indexCount] = splitStr[i];
				indexCount++;
			}
		}
		
        String[] answer = result;
        return answer;
    }
}