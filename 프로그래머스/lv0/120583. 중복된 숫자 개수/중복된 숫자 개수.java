class Solution 
{
    public int solution(int[] array, int n) 
    {
    	int SameCount = 0;
    	
        for(int i = 0; i < array.length; i++)
        	if(array[i] == n)
        		SameCount++;
        
        int answer = SameCount;
        return answer;
    }
}