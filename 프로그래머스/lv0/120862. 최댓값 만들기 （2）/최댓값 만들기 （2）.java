import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) 
	{
		int result = 0;
		int[] numbersSort = new int[numbers.length];
		int maxMul = 0;
		int minMul = 0;
		
		for(int i = 0; i < numbersSort.length; i++) {
			numbersSort[i] = numbers[i];
		}
		
		Arrays.sort(numbersSort);
		maxMul = numbersSort[numbersSort.length-1] * numbersSort[numbersSort.length-2]; 
		minMul = numbersSort[0] * numbersSort[1];
		
		if(maxMul > minMul) result = maxMul;
		else result = minMul;
		
        int answer = result;
        return answer;
    }
}