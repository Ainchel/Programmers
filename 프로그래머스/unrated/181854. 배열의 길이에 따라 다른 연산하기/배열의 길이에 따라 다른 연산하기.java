class Solution {
    public int[] solution(int[] arr, int n) 
	{
		int[] result = arr;
		
		if (arr.length % 2 == 1) // 홀수일 때
		{
			for(int i = 0; i < arr.length; i += 2)
			{
				result[i] += n;
			}
		}	
		
		else if (arr.length % 2 == 0) // 짝수일 때
		{
			for(int i = 1; i < arr.length; i += 2)
			{
				result[i] += n;
			}
		}
			
        int[] answer = result;
        return answer;
    }
}