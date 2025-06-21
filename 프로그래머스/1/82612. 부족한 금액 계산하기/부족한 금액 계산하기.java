class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        
        if(count > 1){
            for(int i = 0; i < count; i++){
                sum += (i+1) * price;
            }
        }
        System.out.println(sum);
        
        if(sum > money) answer = sum - money;
        else answer = 0;

        return answer;
    }
}