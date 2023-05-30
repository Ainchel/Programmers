class Solution
{
    public int solution(int n, int k) 
    {
        int YangSum = n * 12000;
        int DrinkMinus = (int)(n / 10);
        int DrinkSum = 2000 * (k - DrinkMinus);
        
        int Sum = YangSum + DrinkSum;
        int answer = Sum;
        return answer;
    }
}