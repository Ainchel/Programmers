class Solution {
    public int solution(int hp) {
        int nowhp = hp;
      
        int fiveant = 0;
        int threeant = 0;
        int oneant = 0;
        
        fiveant = nowhp / 5;
        nowhp -= fiveant * 5;
        threeant = nowhp / 3;
        nowhp -= threeant * 3;
        oneant = nowhp;
        
        return fiveant + threeant + oneant;
    }
}