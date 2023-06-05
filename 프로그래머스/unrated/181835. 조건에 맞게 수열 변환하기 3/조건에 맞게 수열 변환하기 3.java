class Solution {
    public int[] solution(int[] arr, int k) 
    {	
		if(k % 2 == 1) // 홀수일 때
		{
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] *= k;
			}
			
		}
		
		else if (k % 2 == 0) // 짝수일 때
		{
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] += k;
			}
		}
		
        int[] answer = arr;
        return answer;
    }
}