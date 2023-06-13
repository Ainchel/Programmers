class Solution {
   public int solution(int[] num_list) 
	{
		String odd = "";
		String even = "";
		
		int result = 0;
		
		for(int i = 0; i < num_list.length; i++)
		{
			if(num_list[i] % 2 == 1) // 홀수일 때
			{
				odd += Integer.toString(num_list[i]);
			}
			else if (num_list[i] % 2 == 0) // 짝수일 때
			{
				even += Integer.toString(num_list[i]);
			}	
		}
		
		result = Integer.parseInt(odd) + Integer.parseInt(even);
		
        int answer = result;
        return answer;
    }
}