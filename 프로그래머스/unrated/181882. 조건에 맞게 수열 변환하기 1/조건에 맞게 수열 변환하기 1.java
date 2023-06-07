class Solution {
    public int[] solution(int[] arr) 
	{
		int[] result = arr;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(50 <= result[i] && result[i] % 2 == 0)
			{
				result[i] /= 2;
			}
				
			else if (result[i] < 50 && result[i] % 2 == 1)
			{
				result[i] *= 2;
			}
		}
		
        int[] answer = result;
        return answer;
    }
}