class Solution {
    public String[] solution(String[] todo_list, boolean[] finished)
	{
		int indexCount = 0;
		int idx = 0;
		for(int i = 0; i < finished.length; i++)
		{
			if (finished[i] == false)
			{
				indexCount++;
			}
		}
		
		String[] result = new String[indexCount];
		
		for(int i = 0; i < finished.length; i++)
		{
			if(finished[i] == false)
			{
				result[idx] = todo_list[i];
				idx++;
			}
		}
		
        String[] answer = result;
        return answer;
    }
}