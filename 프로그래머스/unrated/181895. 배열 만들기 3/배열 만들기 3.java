class Solution {
    public int[] solution(int[] arr, int[][] intervals) 
	{
		int firstInterval = intervals[0][1] - intervals[0][0] + 1;
		int secondInterval = intervals[1][1] - intervals[1][0] + 1;
		int idx = 0;
		int[] result = new int[firstInterval + secondInterval];
		
		for(int i = intervals[0][0]; i <= intervals[0][1]; i++)
		{
			result[idx] = arr[i];
			idx++;
		}
		
		for(int i = intervals[1][0]; i <= intervals[1][1]; i++)
		{
			result[idx] = arr[i];
			idx++;
		}

        int[] answer = result;
        return answer;
    }
}