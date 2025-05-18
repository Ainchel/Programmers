#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;  
        for(int devide = 1; devide <= n; devide++){
            if(n % devide == 0){
                answer += devide;
            }
        }
    return answer;
}