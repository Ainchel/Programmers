class Solution {
    public int[] solution(int n) 
	{
		int aliquotCount = 0;
		int idx = 0;
		
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0) {aliquotCount++;}
		}
		
		int[] result = new int[aliquotCount];
		
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0)
			{
				result[idx] = i;
				idx++;
			}
		}
		
        int[] answer = result;
        return answer;
    }
}