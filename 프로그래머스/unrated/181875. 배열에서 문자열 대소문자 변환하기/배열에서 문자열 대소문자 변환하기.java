class Solution {
  public String[] solution(String[] strArr) 
    {
		String[] result = strArr;
		
        for(int i = 0; i < strArr.length; i += 2)
        {
        	result[i] = strArr[i].toLowerCase();
        }
        
        for(int i = 1; i < strArr.length; i += 2)
        {
        	result[i] = strArr[i].toUpperCase();
        }
        
        String[] answer = result;
        return answer;
    }
}