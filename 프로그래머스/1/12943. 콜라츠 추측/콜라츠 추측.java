class Solution {
    public int solution(int num) {
        
        if(num == 1) return 0;
        int saveNum = num;
        int count = 0;
        
        while(count <= 500){
            
            if(saveNum % 2 == 0) saveNum /= 2;
            else if(saveNum % 2 == 1) saveNum = (saveNum * 3) + 1;
            
            count++;
            
            if(saveNum == 1) break;
            if(count == 500) return -1;
        }
        
        System.out.println(count);
        int answer = count;
        return answer;
    }
}