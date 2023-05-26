import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] aArray = null;
        
        if(1 <= a.length() && a.length() <= 10)
        {
        	aArray = a.toCharArray();
        		for(int i = 0; i < aArray.length; i++)
        			System.out.println(aArray[i]);
        } 
      
        sc.close();
    }
}