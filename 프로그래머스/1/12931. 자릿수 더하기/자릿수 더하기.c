#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int saveN = n;
        while(saveN >= 10){
            answer += saveN % 10;    
            saveN /= 10;        
        }
    answer += saveN;
    return answer;
}