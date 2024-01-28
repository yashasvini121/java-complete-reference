class EscapeSequences {
	public static void main(String[] args) {
		// \b is used for backspace, it moves the cursor one step back
		System.out.println("12345\b67890\n");
		
		System.out.println("12345\t67890\n");
		
		// \r is used for carriage return, it moves the cursor to front of the line
		System.out.println("12345\r67890\n");
		
		// It is used to put the cursor at the next page
		System.out.println("12345\f67890");
	
	}
}
