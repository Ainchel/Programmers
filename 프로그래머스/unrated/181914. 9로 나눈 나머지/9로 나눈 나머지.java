class Solution {
    public int solution(String number) 
	{
		StringBuilder sb = new StringBuilder(number);
		int eleSum = 0;
		
		for(int i = 0; i < sb.length(); i++)
		{
			eleSum += sb.charAt(i) - 48;
		}
		
        int answer = eleSum % 9;
        return answer;
    }
}