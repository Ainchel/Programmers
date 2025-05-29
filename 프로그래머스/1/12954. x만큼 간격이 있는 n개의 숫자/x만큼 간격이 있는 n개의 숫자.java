class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        long[] newArray = new long[n];
        long arrayValue = x;
        for(int i = 0; i < n; i++){
            newArray[i] = arrayValue;
            arrayValue += x;
        }
        answer = newArray;
        return answer;
    }
}