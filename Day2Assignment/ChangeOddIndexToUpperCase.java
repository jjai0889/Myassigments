package Week3.Day2Assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "changeme";
		
	           char[] ch = str.toCharArray();
	           
	           for (int i = 0; i < ch.length; i++) {
	        	   
	        	   if(i%2!=0) {
	        		   
	        		   char upperCase = Character.toUpperCase(ch[i]);
	        		   
	        		   System.out.print(upperCase);
	        	   }
	        	   
	        	   else {
	        		   
	        		   System.out.print(ch[i]);
	        		   
	        	   }
	        		   
	        		   
	        	   
	        	   
				
			}
	           
	}

}
