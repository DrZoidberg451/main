//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

//a2 + b2 = c2

//For example, 32 + 42 = 9 + 16 = 25 = 52.

//There exists exactly one Pythagorean triplet for which a + b + c = 1000.

//Find the product abc.

public class Euler9 {

    static boolean isPythagorean(int a,int b,int c) {
        return a*a + b*b == c*c;
    }
    
    static void pythagoreanProduct() {
    	for (int a = 3; a <= 1000; a++) 
	        for (int b = 4; b < 1000; b++)
	        	for (int c = 5; c <= 1000; c++)
	        		if(isPythagorean(a,b,c))
	        			if ((a+b+c) == 1000)
	        				System.out.println(a*b*c);
    }

	public static void main(String[] args) {

		pythagoreanProduct();
	        				
	}
}
