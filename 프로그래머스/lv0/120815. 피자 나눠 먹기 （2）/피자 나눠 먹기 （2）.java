class Solution {
    public int solution(int n) 
	{
		int result = 1;
		
		while(1 <= result && result <= 100)
		{
			if((result * 6) % n == 0) {break;}
				
			result++;
		}
        int answer = result;
        return answer;
    }
}