package ücgen;

public class ücgen {
	public static void main(String[] args) {
		//kenarlar =a,b,c
		int a =3;
     	int b=4 ; 
		int c=5;
		int s=(a+b+c)/2;
		double alan = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("üçgenin alanı= "+alan);
	}
}
