class Solution {
    public int[] solution(int money) {
        
        int coffeeCount = 1;
            
        while(true){
            if(5500 * coffeeCount > money) break;
            coffeeCount++;
        }
        
        int[] answer = {coffeeCount-1, money - (5500 * (coffeeCount-1))};
        return answer;
    }
}