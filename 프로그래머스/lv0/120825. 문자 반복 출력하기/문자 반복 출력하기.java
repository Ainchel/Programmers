class Solution {
    public String solution(String my_string, int n)
    {
        char[] SToC = my_string.toCharArray();
        char[] Result = new char[my_string.length()*n];
        
        for(int i = 0; i < my_string.length(); i++)
        	for(int j = 0; j < n; j++)
        		//문자열 길이가 5이고 3번 반복한다면
        		Result[(i*n)+j] += SToC[i];
        		//Result[0+0] = SToC[0];
        		//Result[0+1] = SToC[0];
        		//Result[0+2] = SToC[0];
        		//Result[3+0] = SToC[1];
        		//Result[3+1] = SToC[1];
        
        String answer = new String(Result);
        return answer;
    }
}