class Solution 
{
    public int[] solution(int[] num_list) 
    {
        int oddCount = 0; // 홀수는 영어로 odd
		int evenCount = 0; // 짝수는 영어로 even
		
		for(int i = 0; i < num_list.length; i++)
		{
			if(num_list[i] % 2 == 0) // 짝수일 때
			evenCount++;
			
			else if (num_list[i] % 2 == 1) // 홀수일 때
			oddCount++;
		}
		
		int[] ResultArray = {evenCount, oddCount};
		
        int[] answer = ResultArray;
        return answer;
    }
}