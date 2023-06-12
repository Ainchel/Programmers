class Solution {
   public int[] solution(int start, int end) 
    {
		int indexCount = end - start + 1;
		int[] result = new int[end - start + 1];
		
		for(int i = 0; i < indexCount; i++)
		{
			result[i] = i + start;
		}
		
        int[] answer = result;
        return answer;
    }
}