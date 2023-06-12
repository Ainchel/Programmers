class Solution {
 public int[] solution(int[] num_list, int n) 
	 {
		 int indexCount;
		 
		 if(num_list.length % n == 0) // 똑 떨어질때
			 indexCount = num_list.length / n;
		 
		 else
			 indexCount = (num_list.length / n) + 1;
		 
		 int[] result = new int[indexCount];
		 
		 for(int i = 0; i < indexCount; i++)
		 {
			 result[i] = num_list[n*i]; 
		 }
		 
	        int[] answer = result;
	        return answer;
	 }
}