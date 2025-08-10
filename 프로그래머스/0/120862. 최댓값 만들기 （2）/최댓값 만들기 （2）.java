import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        int lowMul = numbers[0] * numbers[1];
        int maxMul = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if(lowMul > maxMul) return lowMul;
        else return maxMul;
    }
}