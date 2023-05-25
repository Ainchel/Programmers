import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        char[] CheckChar = str.toCharArray();
        
        for(int i = 0; i < CheckChar.length; i++)
        {
        	if(Character.isUpperCase(CheckChar[i]) == true) // 대문자일 때
        		CheckChar[i] = Character.toLowerCase(CheckChar[i]);
        	else // 소문자일 때
        		CheckChar[i] = Character.toUpperCase(CheckChar[i]);
        }
        
        System.out.println(CheckChar);
       
        sc.close();
        
    }
}