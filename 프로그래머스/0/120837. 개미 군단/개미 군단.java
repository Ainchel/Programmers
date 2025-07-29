class Solution {
    public int solution(int hp) {
        int nowhp = hp;
      
        int fiveant = 0;
        int threeant = 0;
        int oneant = 0;
        
        fiveant = nowhp / 5;
        threeant = (nowhp % 5) / 3;
        oneant = ((nowhp % 5) % 3);
        
        return fiveant + threeant + oneant;
    }
}