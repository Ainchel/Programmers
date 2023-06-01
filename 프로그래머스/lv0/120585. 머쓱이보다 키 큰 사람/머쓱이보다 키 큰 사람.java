class Solution {
    public int solution(int[] array, int height) 
	{
		int TallerCount = 0;
		
		for(int i = 0; i < array.length; i++)
			if(height < array[i])
				TallerCount++;
	
        int answer = TallerCount;
        return answer;
    }
}