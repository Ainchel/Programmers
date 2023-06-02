class Solution {
    public int solution(int[] num_list) 
	{
		int result = 0;
		
		if(11 <= num_list.length)
		{
			for(int i = 0 ; i < num_list.length; i++)
			{
				result += num_list[i];
			}
		}
		
		else if (num_list.length <= 10)
		{
			result = 1;
			for(int i = 0; i < num_list.length; i++)
			{
				result *= num_list[i];
			}
			
		}
		
        int answer = result;
        return answer;
    }
}