class Solution {
    public int[] solution(int[] numbers) 
	{
		int Result[] = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++)
			Result[i] = numbers[i] * 2;
		
        int[] answer = Result;
        return answer;
    }
}