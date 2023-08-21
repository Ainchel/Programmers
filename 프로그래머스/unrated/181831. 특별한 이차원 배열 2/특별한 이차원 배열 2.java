class Solution {
   public int solution(int[][] arr) {
		
		boolean check = false;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i][j] == arr[j][i]) {
					check = true;
				}
				else {
					check = false;
					break;
				}
			}
		}
		
		int answer = check == true ? 1 : 0;
		return answer;
		
	}
}