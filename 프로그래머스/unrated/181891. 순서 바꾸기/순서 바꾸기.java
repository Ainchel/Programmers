class Solution {
    public int[] solution(int[] num_list, int n) 
	{
		int idxCount = 0;
		int tailIndex = 0;
		int[] result = new int[num_list.length];
		
		for(int i = 0; i < num_list.length - n; i++)
		{
			result[i] = num_list[n + i];
			idxCount++;
		}
		
		for(int i = num_list.length - n; i < num_list.length; i++)
		{
			result[i] = num_list[tailIndex];
			tailIndex++;
		}
		
		//result 2 3 4 = num_list 0 1 2
		//result 2 = num_list 0
		
        int[] answer = result;
        return answer;
    }
}