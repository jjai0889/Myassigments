package Week3.Day2Assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am a software tester";
		
		//a) split the words and have it in an array
		
		String[] splittext = str.split(" ");
		
		//			b) Traverse through each word (using loop)
		
		for (int i = 0; i < splittext.length; i++) {
			
			//c) find the odd index within the loop (use mod operator)
			
			if(i%2!=0) {
				
				//System.out.println(splittext[i]);
			
			
			//d)split the words and have it in an array
			
			char[] charArray = splittext[i].toCharArray();
			
			//e)print the even position words in reverse order using another loop (nested loop)
			
			for (int j = charArray.length-1; j >=0; j--) {
				
				System.out.print(charArray[j]+" ");
				
			}
			
			
			}
			else {
				
				System.out.println(" "+splittext[i]+" ");
			}
			
			}
			
			
		}

	}


