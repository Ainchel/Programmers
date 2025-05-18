class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        long saveN = n;
        int arrayCount = 0;
        while(saveN >= 10){
            arrayCount++;
            saveN /= 10;
        }
        arrayCount++;
        int[] reverseArray = new int[arrayCount];
        saveN = n;
        for(int i = 0; i < arrayCount; i++){
            reverseArray[i] = (int)(saveN % 10);
            saveN /= 10;
        }
        answer = reverseArray;
        return answer;
    }
}