class Solution 
{
    public String solution(String my_string, int k) 
    {
        String ms_Sum = "";
        
        for(int i = 1; i <= k; i++)
        ms_Sum += my_string;
        
        String answer = ms_Sum;
        return answer;
    }
}