package Practice;
import java.util.Scanner;
public class CountDemo {
	public static void main(String [] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter your Number for count :");
     int num = sc.nextInt();
     int count=0;
     for( ;num>0; ) {
    	 num=num/10;
    	 count++;
    	 
    }
     System.out.println("count of number:"+count);
     
     
	}
}