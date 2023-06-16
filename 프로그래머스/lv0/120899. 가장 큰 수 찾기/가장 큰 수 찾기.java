class Solution {
    public int[] solution(int[] array) 
	{
		int max = 0;
		int maxidx = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(max < array[i])
			{
				max = array[i];
				maxidx = i;
			}
		}
		
        int[] answer = {max, maxidx};
        return answer;
    }
}