class Solution {
    public int solution(int hp) 
    {
		int result = 0;
		
		result += (hp / 5) + (hp % 5) / 3 + ((hp % 5) % 3);
		
        int answer = result;
        return answer;
    }
}