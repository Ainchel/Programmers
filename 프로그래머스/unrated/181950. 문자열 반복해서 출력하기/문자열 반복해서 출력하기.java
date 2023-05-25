import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String strSum = "";
        if(1 <= str.length() && str.length() <= 10)
            if(1 <= n && n <= 10)
                for(int i = 1; i <= n; i++)
                strSum += str;
        System.out.println(strSum);
    }
}