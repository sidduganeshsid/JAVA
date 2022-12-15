//5. WAP to implement Anagram Checking least inbuilt methods being used.
import java.lang.*;
import java.util.*;

public class Q5ImpAnagramLeastInbuiltMetd {

	public static void main(String[] args) {
		String s1 = "rACe";
		String s2 = "caRE";
		
		s1 = s1.replace(" ","");
		s2 = s2.replace(" ","");
		
		for(int i=0;i<s1.length();i++)
			if((s1.charAt(i)>=65)&&(s1.charAt(i)<=90))
				s1=(s1.replace(s1.charAt(i),(char)(s1.charAt(i)+32)));
		
		for(int i=0;i<s2.length();i++)
			if((s2.charAt(i)>=65)&&(s2.charAt(i)<=90))
				s2=(s2.replace(s2.charAt(i),(char)(s2.charAt(i)+32)));
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
//		System.out.println(ch1);
//		System.out.println(ch2);
//		
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=1;j<ch1.length-i;j++)
			{
				if(ch1[j]<ch1[j-1])
				{
					char tempVar = ch1[j];
					ch1[j] = ch1[j-1];
					ch1[j-1] = tempVar;
				}					
			}
		}
		
		for(int i=0;i<ch2.length;i++)
		{
			for(int j=1;j<ch2.length-i;j++)
			{
				if(ch2[j]<ch2[j-1])
				{
					char tempVar = ch2[j];
					ch2[j] = ch2[j-1];
					ch2[j-1] = tempVar;
				}					
			}
		}
//		
//		System.out.println(ch1);
//		System.out.println(ch2);
//		
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("It is Anagram");
		}
		else
		{
			System.out.println("It is not Anagram");
		}
		
	}
}
