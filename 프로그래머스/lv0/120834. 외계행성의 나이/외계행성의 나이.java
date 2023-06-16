class Solution {
    public String solution(int age) 
    {
        String str = String.valueOf(age);
        StringBuilder sb = new StringBuilder(str);
        
        for(int i = 0; i < sb.length(); i++)
        {
        	sb.setCharAt(i, (char)(sb.charAt(i)+49));
        }
        
        String answer = sb.toString();
        return answer;
    }
}