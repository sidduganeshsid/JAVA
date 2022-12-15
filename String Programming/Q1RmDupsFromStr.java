//1. WAP to remove Duplicates from a String.(Take any String ex with duplicates
//character)
public class Q1RmDupsFromStr {

	public static void main(String[] args) {
		 String s = "hello world";
		 String empty = new String();
		 
		 System.out.println("Removing duplicate characters from a string");
		 for(int i=0;i<s.length();i++)
		 {
			 char c = s.charAt(i);
			// System.out.println(empty.indexOf(c));
			 if(empty.indexOf(c)<0)
			 {
				 empty = empty + c;
			 }
		 }
		 s = empty;
		 System.out.println(s);
	}

}
