
import java.util.Arrays;
class Solution {
    public int solution(int[] array) 
    {
    	int[] Sort = array;
        
    	Arrays.sort(Sort);
    	int MiddleCount = (array.length - 1) / 2;
    	int MiddleValue = Sort[MiddleCount];
    	
        int answer = MiddleValue;
        return answer;
    }
}