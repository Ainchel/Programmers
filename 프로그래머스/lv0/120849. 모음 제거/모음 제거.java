class Solution 
{
    public String solution(String my_string) 
	{
		StringBuilder a = new StringBuilder(my_string);
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		
		for(int i = 0; i < a.length(); i++)
			for(int j = 0; j < vowel.length; j++)
				if(a.charAt(i) == vowel[j])
				{
				a.deleteCharAt(i);
				i--;
                break;//요 구문이 break;와 같다 == i값이 하나 빠져서 정상적으로 for문이 돌아간다.
				}
		
        String answer = a.toString();
        return answer;
    }
}