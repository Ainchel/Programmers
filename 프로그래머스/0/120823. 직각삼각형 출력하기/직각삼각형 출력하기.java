import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        
        while(count <= n){
            for(int i = 0; i < count; i++){
                System.out.print("*");
            }
            System.out.println("");
            count++;
        }
    }
}