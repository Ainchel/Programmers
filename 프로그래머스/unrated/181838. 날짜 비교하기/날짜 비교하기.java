class Solution {
   public int solution(int[] date1, int[] date2) 
	{
		int result = -1;
		
		int dayValue1 = (date1[0] * 100000) + (date1[1] * 1000) + (date1[2] * 1);
		int dayValue2 = (date2[0] * 100000) + (date2[1] * 1000) + (date2[2] * 1);
		
		if(dayValue1 >= dayValue2) {result =  0;}
		else {result = 1;}
		
        int answer = result;
        return answer;
    }
}