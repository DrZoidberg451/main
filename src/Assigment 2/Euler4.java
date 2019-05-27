//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

//Find the largest palindrome made from the product of two 3-digit numbers.

public class Euler4 {
	
	static boolean isPalindrome(int n) {
		int reminder,sum=0,temp;    
		  
		  temp=n;    
		  while(n>0){    
		   reminder=n%10; 
		   sum=(sum*10)+reminder;    
		   n=n/10;    
		  }    
		  if(temp==sum)
			  return true;
		  else
			  return false;
	}
	
	static void largestPalindrome() {
		int palindrome=0;
		int biggest = 0;
		for (int i=100;i<1000;i++){
	        for (int j=100;j<1000;j++){
	        	palindrome = i * j;
	        	if(isPalindrome(palindrome)) {
	        		if(palindrome>biggest) {
	        			biggest = palindrome;
	        		}
	        		
	        	}
	        }
	        }
		System.out.println(biggest);
	}

	public static void main(String[] args) {
		
		largestPalindrome();

	}

}
