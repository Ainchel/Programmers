class Solution {

	public int[] solution(int[] arr, int[] delete_list) 
	{
		int indexCount = arr.length;
		int idx = 0;
		boolean isSame = false;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < delete_list.length; j++)
			{
				if(arr[i] == delete_list[j]) 
				{
					indexCount--;
					break;
				}
			}
		}
		
		int[] result = new int[indexCount];
		
		for(int i = 0; i < arr.length; i++)
		{
			isSame = false;
			for(int j = 0; j < delete_list.length; j++)
			{
				if(arr[i] == delete_list[j])
					{
						isSame = true;
						break;
					}
			}
			
			if(isSame == false)
			{
				result[idx] = arr[i];
				idx++;
			}
				
		}
		
        int[] answer = result;
        return answer;
    }
}