
public class CodeQuotient {
	public static void main(String[] args) {
		int a=1,b=100;
		for(int i=a;i<=b;i++) {
			
			//Prints "CodeQuotient" IF NUMBER IS DIVISIBLE BY BOTH
			if(i%3==0 && i%5==0) {
				System.out.println("CodeQuotient");
				continue;
			}
			
			//Prints "Code" IF NUMBER IS DIVISIBLE BY ONLY 3
			if(i%3==0) {
				System.out.println("Code");
				continue;
			}
			
			//Prints "Quotient" IF NUMBER IS DIVISIBLE BY ONLY 5
			if(i%5==0) {
				System.out.println("Quotient");
				continue;
			}
			
			//Prints the Number if all of these conditions are not met 
			System.out.println(i);				
		}
	}
	
}
