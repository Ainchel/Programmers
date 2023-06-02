class Solution {
    public int solution(int n) 
	{
		String a = Integer.toString(n);
		char[] b = a.toCharArray();
		int result = 0;
		for(int i = 0; i < b.length; i++)
			result += Integer.parseInt(String.valueOf(b[i]));
		
        int answer = result;
        return answer;
    }
}