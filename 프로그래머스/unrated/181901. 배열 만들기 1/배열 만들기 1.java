class Solution {
    public int[] solution(int n, int k) 
	{
		int[] result = new int[n / k];
		
		for(int i = 0; i < result.length; i++)
		{
			result[i] = k * (i+1);
		}
		
        int[] answer = result;
        return answer;
    }
}