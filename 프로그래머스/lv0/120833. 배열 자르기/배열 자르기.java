class Solution 
{
    public int[] solution(int[] numbers, int num1, int num2) 
	    {

	        int IndexCount = num2 - num1 + 1;
	    	int[] Result = new int[IndexCount];
	        
	    	if(num1 < num2) 
	    	{
	    		for(int i = 0; i < IndexCount; i++)
	    			Result[i] = numbers[num1+i];
	    	}
	    	
	        int[] answer = Result;
	        return answer;
	    }
}