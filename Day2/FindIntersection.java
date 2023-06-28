package week1.Day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declared an array
		int value[]={3,2,11,4,6,7};
		
		//declared an another array
		int value2[]={1,2,8,4,9,7};
		
		
		//loop iteration
		for (int i = 0; i < value.length; i++) {
			
			//Nested loop
			for(int j=0; j< value2.length; j++) {
				
				if(value[i]==value2[j]) {
					
					System.out.println(value[i]);
				}
			}
			
		}

	}

}
