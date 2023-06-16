class Solution {
    public int[] solution(int n, int[] numlist) 
	{
		int indexCount = 0;
		int[] numcopy = numlist;
		
		for(int i = 0; i < numcopy.length; i++)
		{
			if(numcopy[i] % n == 0)indexCount++;
		}
		
		int[] result = new int[indexCount];
		
		for(int i = 0; i < result.length; i++)
		{
			for(int j = 0; j < numcopy.length; j++)
			{
				if(numcopy[j] % n == 0)
				{
					if(numcopy[j] == -9999)
						continue;
					
					result[i] = numcopy[j];
					numcopy[j] = -9999;
					break;
				}	
			}
		}
		
		int[] answer = result;
        return answer;
    }
}