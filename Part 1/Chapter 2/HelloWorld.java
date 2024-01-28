/**
 * This is the documentation type comment in java
 */

class HelloWorld2 {
	/* 
	This class has a testing function which doesn't have the static keyword, that's why we had to create it's object for use.
	*/
	
	void testing() {
		System.out.println("This output is of another class from this file only.");
	}
}

class HelloWorld3 {
	static void testing() {
		System.out.println("This output is of another class from this file only where the function had static keyword.");
	}
}

class HelloWorld {
	// Below is the main function
	public static void main(String[] args) {
		System.out.println("Hello World!!" + 1);
		HelloWorld2 hw2 = new HelloWorld2();
		hw2.testing();
		HelloWorld3.testing();
	}
}
