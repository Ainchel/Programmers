class Solution {
    public int solution(int n, int k) {
        int lambPrice = 12000;
        int canPrice = 2000;
        int priceSum = 0;
        
        if(n >= 10){
            priceSum = (lambPrice * n) + (canPrice * (k - (n/10)));
        } else{
            priceSum = (lambPrice * n) + (canPrice * k);
        }
        
        int answer = priceSum;
            
        return answer;
    }
}