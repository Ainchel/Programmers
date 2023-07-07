class Solution {
  public int[] solution(int n) {
		//콜라츠 수열 만들기.
		//1000 이내의 숫자 x가 있을 때, x가 짝수라면 2로 나누고, 홀수라면 x*3 + 1을 하는 계산을 반복하면 1로 도달할 수 있다.
		
		int idxCount = 1;
		int m = n;
		
		while(true) {
			
			if(n != 1){
				if(n%2 == 0) { // 짝수일 때
					n /= 2;
					idxCount++;
				} else {
					n = n*3 + 1;
					idxCount++;
				}
			} else {break;}
			
					
			}
			
		int[] result = new int[idxCount];
		result[0] = m;
		
		for(int i = 1; i < idxCount; i++){
			if(m % 2 == 0) {
				m /= 2;
				result[i] = m;
			} else {
				m = m * 3 + 1;
				result[i] = m;
			}
		}
		int[] answer = result;
	    return answer;
    }
}