package practice;

public class StaticDemo {
	static {
		printDemo();
	}
	static void printDemo() {
		System.out.println("This is static method block\n");
	}
	public static void main(String[] args) {
		System.out.println("This is main block");
	}
}
