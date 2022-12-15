//8. WAP to find the maximum occurring character in a String.
public class Q8MaxOcurOfChar {

	static final int ASCII_SIZE = 256;
	static char maxOcurChar(String str)
			{
				int count[] = new int[ASCII_SIZE];

				int len = str.length();
				for (int i = 0; i < len; i++)
					count[str.charAt(i)]++;

				int max = -1;
				char result = ' '; 

				for (int i = 0; i < len; i++) {
					if (max < count[str.charAt(i)]) {
						max = count[str.charAt(i)];
						result = str.charAt(i);
					}
				}

				return result;
			}

			public static void main(String[] args)
			{
				String st = "Harrish";
				System.out.println("Max occurring character is "
								+ maxOcurChar(st));
			}
		

	}
