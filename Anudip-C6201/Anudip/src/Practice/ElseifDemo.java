package Practice;

import java.util.Scanner;

public class ElseifDemo {
    public static void main(String []args) {
    	Scanner sc = new Scanner(System.in);
	     System.out.println("Enter your Number 1:");
	     int num1 = sc.nextInt();
	     
	     System.out.println("Enter your Number 2:");
	     int num2 = sc.nextInt();
	     
	     System.out.println("Enter your Number 3:");
	     int num3 = sc.nextInt();
        if (num1>num2 && num1>num3) {
        	System.out.println(num1+":is Maximum number of three  given number.");
        	
        }
    		
        else if(num2>num1 && num2>num3) {
        	System.out.println(num2+":is Maximum number of three  given number.");
        	
        	
        }	
        else{
        	
        	System.out.println(num3+":is Maximum number of three  given number.");
        	
        	
        }
    	
    	
    	
    	
    	
    	
    	
    }
}
