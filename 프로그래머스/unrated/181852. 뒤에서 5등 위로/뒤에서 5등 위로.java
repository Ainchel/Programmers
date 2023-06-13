import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) 
	 {
		 	int[] sortNum = new int[num_list.length - 5];
		 	Arrays.sort(num_list);
		 	
		 	for(int i = 0; i < sortNum.length; i++)
		 	{
		 		sortNum[i] = num_list[5 + i];
		 	}
		 	
	        int[] answer = sortNum;
	        return answer;
	 }
}