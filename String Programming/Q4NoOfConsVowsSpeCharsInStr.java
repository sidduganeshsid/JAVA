//4. WAP to count the number of consonants, vowels, special characters in a String.
public class Q4NoOfConsVowsSpeCharsInStr {

	public static void main(String[] args) {
		String s = "Hey, I am learning JAVA";
		int consonants=0, vowels = 0, specialchars=0;
		
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			
			if(c>='a'&&c<='z')
			{
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					vowels++;
				else
				   consonants++;
			}
			else if(c>=0&&c<=9)
			    break;
			else
				specialchars++;
		}
		System.out.println("vowels :"+vowels);
		System.out.println("consonants :"+consonants);
		System.out.println("special characters :"+specialchars);
	}

}
