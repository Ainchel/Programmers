class Solution {
   public int solution(int[] arr, int idx) {
		
		int result = 0;
		
		for(int i = 0; i < arr.length; i++)
        {
        	if(idx <= i && arr[i] == 1) {
        		result = i;
        		break;
        	} else {
        		result = -1;
        	}

        }
		
		int answer = result;
        return answer;
        
        
    }
}