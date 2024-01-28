class NoMainMethod {
	static {
		System.out.println("This doesn't have the main()");
		System.exit(0);
	}
}

/**
 *  Prior to java 7, the execution sequence was as follows:
 *  - loads class
 *  - executes static blocks
 *  - looks for main method and invokes it
 * 
 *  So, the function would first print the o/p and then give the no main() error, but now it is simply not possible
 *  Source: https://stackoverflow.com/questions/15173474/can-we-execute-a-java-program-without-a-main-method
 */
