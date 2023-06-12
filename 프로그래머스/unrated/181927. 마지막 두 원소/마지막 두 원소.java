class Solution {
   public int[] solution(int[] num_list) 
	{
		int listLength = num_list.length;
		int[] result = new int[listLength + 1];
		
		for(int i = 0; i < listLength; i++)
			result[i] = num_list[i];
		
		if(num_list[listLength - 1] > num_list[listLength - 2])
		{
			result[listLength] = num_list[listLength - 1] 
									- num_list[listLength - 2];
		}
		
		else if (num_list[listLength - 1] <= num_list[listLength - 2])
		{
			result[listLength] = num_list[listLength - 1] * 2;
		}
		
        int[] answer = result;
        return answer;
    }
}