class Solution {
   public int solution(int num, int k)
	{
		String str = Integer.toString(num);
		StringBuilder sb = new StringBuilder(str);
		int result = 0;
		
		for(int i = 0; i < sb.length(); i++)
		{
			if((sb.charAt(i) - 48) == k)
			{
				result = i + 1;
				break;
			}
		}
		
		if(result == 0) result = -1;
		
        int answer = result;
        return answer;
    }
}