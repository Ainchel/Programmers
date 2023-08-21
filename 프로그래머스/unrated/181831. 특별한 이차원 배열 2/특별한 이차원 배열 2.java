class Solution {
   public int solution(int[][] arr) {
	        int checkCount = 0;
       
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr.length; j++) {
                    if(arr[i][j] != arr[j][i]) {
                        checkCount++;
                    }
			    }
		    }
		
		int answer = (checkCount == 0 ? 1 : 0);
		return answer;
		
	}
}