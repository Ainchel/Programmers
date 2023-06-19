class Solution {
    public String[] solution(String[] names) 
	{
		int indexCount = -1;
		
		if(names.length % 5 == 0) {indexCount = names.length / 5;}
		else {indexCount = (names.length / 5) + 1;}

		String[] result = new String[indexCount];
		
		for(int i = 0; i < result.length; i++)
		{
			result[i] = names[5*i];
		}
		
        String[] answer = result;
        return answer;
    }
}