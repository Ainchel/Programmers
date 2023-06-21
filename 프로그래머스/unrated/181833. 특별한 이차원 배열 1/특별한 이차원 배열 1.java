class Solution {
    public int[][] solution(int n) 
	{
		int idxCount = n;
		
		int[][] result = new int[n][n];
		
		for(int i = 0; i < result.length; i++)
		{
			result[i][i] = 1;
		}
		
        int[][] answer = result;
        return answer;
    }
}