class Solution { 
    public long solution(long n) {
        
        //double doubleN = (double)n;
        double rootN = Math.sqrt(n);
        
        //System.out.println(doubleN);
        System.out.println(rootN);
        long longN = (long)rootN;
        if(longN == rootN) return (longN + 1) * (longN + 1);
        else return -1;
        
        //boolean isSame = 
        
//         long answer = 0;
//         long count = 1;
//         while(n >= count){
//             if(n / count == count){
//                 answer = (count+1) * (count+1);
//                 return answer;
//             }
//             count++;
//         }
        
//         return -1;
        //return -1;
    }
}