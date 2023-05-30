class Solution 
{
    public double solution(int[] numbers) 
    {
        double sum = 0;
        double Average = 0.0;
        
        for(int i = 0; i < numbers.length; i++)
        	sum += numbers[i];
        
        Average = (double)(sum / numbers.length);
        
        double answer = Average;
        return answer;
    }
}