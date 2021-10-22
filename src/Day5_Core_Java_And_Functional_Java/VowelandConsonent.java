package Day5_Core_Java_And_Functional_Java;

import java.util.Scanner;

public class VowelandConsonent {

	public static void main(String[] args) {
		

		System.out.println("Enter a character : ");
		char ch;
		Scanner sc = new Scanner(System.in);
		  ch = sc.next().charAt(0);

	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
	            System.out.println(ch + " is vowel");
	        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	    		System.out.println("Entered character "+ch+" is Consonent");
	        else
	            System.out.println(ch + " is not a alphabet");

	}

}
