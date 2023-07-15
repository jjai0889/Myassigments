package Week3.Day2Assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //* a) Declare A String value as"madam"

		String str = "madam";
		
		char[] ch = str.toCharArray();
		
		String rev ="";
		
		for (int i = ch.length-1; i >=0; i--) {
			
			rev=rev+ch[i];		
			
		}
		
		if(str.equalsIgnoreCase(rev)) {
			
			System.out.println("This is palindrome");
		}
		
		else {
			
			System.out.println("This is not palindrome");
		}
	}

}
