class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int saveSum = x;
        boolean answer;
        while(x >= 10){
            sum += x % 10;
            x /= 10;
        }
        sum += x;
        System.out.println(sum);
        if(saveSum % sum == 0) answer = true;
            else answer = false;
        
        return answer;
    }
}