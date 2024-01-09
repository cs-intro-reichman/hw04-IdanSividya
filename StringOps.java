public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        int[] a = allIndexOf("Hello worLd",'l');
				for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
				}

    }

    public static String capVowelsLowRest (String string) {
        char[] vowels = {'a','e','i','o', 'u', 'A','E','I','O', 'U'};
		String result = "";
		boolean isVowel = false;
		for (int i = 0; i < string.length(); i++){
			char convertChar = string.charAt(i);
			isVowel = false;
			for (int j = 0; j < vowels.length; j++){
				
				 if (convertChar == vowels [j])
				{
					isVowel = true;
				}
			}
			
			if (!isVowel)
			{
				if (convertChar >= 65 && convertChar <=90)
				{
				convertChar = (char)(convertChar + 32);
				result = result + convertChar;
				}
				else
				{
				result = result + convertChar;	
				}
			}
			if (isVowel)
			{
				if (convertChar>90)
				{
				convertChar = (char)(convertChar - 32);
				result = result + convertChar;
				}
				else
				result = result + convertChar;	
			}				
		}
      return result;
    }

    public static String camelCase(String string) {
	String camelCase = "";
	int space = 0;
	int spaceindex = 0;
	for (int i = 0; i < string.length(); i++){	
		char letter = string.charAt(i);
		if (space == 0)
		{
			if (letter!=32)
		{
			if (letter >= 65 && letter <=90)
				{
				letter = (char)(letter + 32);
				}	
				camelCase = camelCase + letter;

		}
			if (letter == 32)
			{
				if (camelCase.length() != 0)
				space++;
				spaceindex = i;
			}
		}
		else
		{
			if (letter ==32)
				spaceindex = i;
			
			else if (letter!=32 && i == spaceindex + 1)
			{
				if (letter > 90){
					letter = (char)(letter - 32);
				}
			camelCase = camelCase + letter;
			}
			else if (letter!=32 && i != spaceindex + 1){
				if (letter >= 65 && letter <=90)
				{
				letter = (char)(letter + 32);
				}	
			camelCase = camelCase + letter;	
				
			}		
		}
    }
	        return camelCase;

	}

    public static int[] allIndexOf (String string, char chr) {
		int CountIndex = 0;
		for (int i = 0; i < string.length(); i++){	
			char temp = string.charAt(i);
			if (chr == temp)
			{
				CountIndex++;
			}
		}
		
		int [] allIndexOf = new int[CountIndex];
		for (int j = 0; j < allIndexOf.length; j++){	
			for (int k = 0; k < string.length(); k++){	
			char temp = string.charAt(k);
			if (chr == temp)
			{
				allIndexOf [j] = k;
				j++;
			}

			}
		}		
        return allIndexOf;
    }
}
