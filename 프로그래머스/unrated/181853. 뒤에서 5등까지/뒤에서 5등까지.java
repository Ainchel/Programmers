import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) 
	{
		int[] result = new int[5];
		int[] num_listSort =num_list;
		Arrays.sort(num_listSort);
		
		for(int i = 0; i < result.length; i++)
		{
			result[i] = num_listSort[i]; 
		}
		
        int[] answer = result;
        return answer;
    }
}