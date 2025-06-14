function solution(n) {
    
    const input = String(n ** (1/2));
     
    if(input.includes('.')){
        return -1;
    }
    
    let answer = 0n;
    answer = (BigInt(input)+1n) ** 2n;     
        
    return answer;
}