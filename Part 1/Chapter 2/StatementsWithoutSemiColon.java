// Source: https://www.geeksforgeeks.org/print-hello-world-without-using-a-semicolon-in-java/

class StatementsWithoutSemiColon {
	// If we place the statement inside an if/for statement with a blank pair of parentheses,
	// we don’t have to end it with a semicolon.
	public static void main(String[] args) {
		if(System.out.printf("This was without semicolon.") == null) {}
		
		if (System.out.append("Hello World") == null) {}
		
		if (System.out.append("Hello World").equals(null)) {}
	}
}
