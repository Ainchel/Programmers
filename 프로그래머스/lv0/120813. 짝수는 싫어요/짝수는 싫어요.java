class Solution {
  public int[] solution(int n) 
	{
		int indexCount = -1;
		
		if(n % 2 == 0) // 짝수일 때
			{
			indexCount = n / 2;
			}
		
		else if (n % 2 == 1) // 홀수일 때
		{
			indexCount = (n / 2) + 1;
		}
		
		int[] result = new int[indexCount];
		
		for(int i = 0; i < indexCount; i++)
		{
			result[i] = (2*i) + 1; 
		}
		
        int[] answer = result;
        return answer;
    }
}