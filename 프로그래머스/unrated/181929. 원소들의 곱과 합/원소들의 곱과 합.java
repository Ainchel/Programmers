class Solution 
{
    public int solution(int[] num_list)
    {
		int result = -1;
        int mul = 1;
        int Sum = 0;
        int SquareSum;
        
        for(int i = 0; i < num_list.length; i++)
        {
        	mul *= num_list[i];
        	
        	Sum += num_list[i];
        }
        	
        	SquareSum = (int)(Math.pow(Sum, 2));
        	
        if(mul < SquareSum)
        {
        	result = 1;
        }	
        
        else if (mul > SquareSum)
        {
        	result = 0;
        }
        
        int answer = result;
        return answer;
    }
}