class Solution {
   public int[] solution(int[] num_list, int n) 
	 {
		 int indexCount = num_list.length - n + 1;
		 int[] result = new int[indexCount];
		 
		 for(int i = 0; i < indexCount; i++)
		 {
			 result[i] = num_list[n - 1 +i]; 
		 }
		 
	        int[] answer = result;
	        return answer;
	 }
}