class Solution {
    public int solution(int order) 
	{
		String intToStr = Integer.toString(order);
		StringBuilder sb = new StringBuilder(intToStr);
		int result = 0;
				
		for(int i = 0; i < sb.length(); i++)
		{
			if(sb.charAt(i) - 48 == 0) continue;
			
			if((sb.charAt(i) - 48) % 3 == 0)
			{
				result++;
			}
		}
		
        int answer = result;
        return answer;
    }
}