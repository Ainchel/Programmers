class Solution {
    public int[] solution(int[] arr) 
	{
		int indexCount = 0;
		int nextIndex = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			indexCount += arr[i];
		}
		
		int[] result = new int[indexCount];
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i]; j++)
			{
				result[nextIndex] = arr[i];
				nextIndex++;
			}
		}
		
        int[] answer = result;
        return answer;
    }
}