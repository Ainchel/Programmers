class Solution {
    public int solution(int n) {
        int answer = 0;
        int devideCount = 1;
        while(n % devideCount != 1){
            devideCount++;
        }
        answer = devideCount;
        return answer;
    }
}