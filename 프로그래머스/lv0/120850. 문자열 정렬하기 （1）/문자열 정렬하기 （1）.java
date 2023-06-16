import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string)
	{
		StringBuilder SB = new StringBuilder(my_string);
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < my_string.length(); i++)
		{
			if('0' <= SB.charAt(i) && SB.charAt(i) <= '9')
			{
				result.add(Character.getNumericValue(SB.charAt(i)));
			}
		}	
		
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
        {
        	answer[i] = result.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}