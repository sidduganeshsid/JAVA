//7. WAP to find if String contains all unique characters.
public class Q7IfStrContAllUniqChars {

	boolean uniqueChars(String st)
	{
		for (int i = 0; i < st.length(); i++)
		{
            for (int j = i + 1; j < st.length(); j++)
            {
                if (st.charAt(i) == st.charAt(j))
                {
                    return false;
                }
            }
		}
        return true;
	}
	public static void main(String[] args) 
	{
		String str = "good"; 
		//good is a string which consists of duplicate characters
		//bad is a string with unique characters
		Q7IfStrContAllUniqChars n = new Q7IfStrContAllUniqChars();
		if(n.uniqueChars(str))
			System.out.println("The given string has all unique characters");
		else
			System.out.println("The given string has duplicate characters");
	}

}
