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
      
    }

    public static String capVowelsLowRest (String string) {
		// define vowels array, new empty string and boolean to check  letter is vowel
        char[] vowels = {'a','e','i','o', 'u', 'A','E','I','O', 'U'};
		String result = "";
		boolean isVowel = false;
		for (int i = 0; i < string.length(); i++){
			char convertChar = string.charAt(i);
			isVowel = false;
			// check for each char if is vowel
			for (int j = 0; j < vowels.length; j++){
				
				 if (convertChar == vowels [j])
				{
					isVowel = true;
				}
			}
			// low all letters that not vowel
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
			// all vowel letters change to uppercase
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
	//define empty string to return, and space parameters for seperate between words.
	String camelCase = "";
	int space = 0;
	int spaceindex = 0;
	for (int i = 0; i < string.length(); i++){	
		char letter = string.charAt(i);
		//On the first word only.
		if (space == 0)
		{
			if (letter!=32)
		{
		// all letters in first word in low case
			if (letter >= 65 && letter <=90)
				{
				letter = (char)(letter + 32);
				}	
				camelCase = camelCase + letter;

		}
		// check if the first word end.
			if (letter == 32)
			{
				if (camelCase.length() != 0)
				space++;
				spaceindex = i;
			}
		}
		// from the second word.
		else
		{
			if (letter ==32)
				spaceindex = i;
		// the first letter on each word (after space) with uppercase.
			else if (letter!=32 && i == spaceindex + 1)
			{
				if (letter > 90){
					letter = (char)(letter - 32);
				}
			camelCase = camelCase + letter;
			}
			// other letters in the word with low case.
			else if (letter!=32 && i != spaceindex + 1){
				if (letter >= 65 && letter <=90)
				{
				letter = (char)(letter + 32);
				}	
			camelCase = camelCase + letter;	
				
			}		
		}
    }
	//return the new string
	        return camelCase;
	}

    public static int[] allIndexOf (String string, char chr) {
		int CountIndex = 0;
		// count the number that the char appear in the string
		for (int i = 0; i < string.length(); i++){	
			char temp = string.charAt(i);
			if (chr == temp)
			{
				CountIndex++;
			}
		}
		// define array with the size of the number index the char appear.
		int [] allIndexOf = new int[CountIndex];
		// put in the array all indicies which the char appear in the string.
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
		// retrn the array
        return allIndexOf;
    }
}
