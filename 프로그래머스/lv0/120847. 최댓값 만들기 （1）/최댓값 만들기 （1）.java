import java.util.Arrays;

class Solution 
{
    public int solution(int[] numbers) 
    {
		int Result;
		
        int[] Sort = numbers;
        Arrays.sort(Sort);
        
        Result = Sort[Sort.length-1] * Sort[Sort.length-2];
        
        int answer = Result;
        return answer;
    }
}