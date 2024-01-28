public class Identifiers {
	public static void main(String[] args) {
		int $ = 10;
		System.out.println($);
		
		// Cannot begin with _ now, earlier it was possible
		// Latest versions of the Java reserve this name as a keyword and/or give it special semantics.
		// If you use the underscore character (“_”) an identifier, your source code can no longer be compiled
		int _a = 5;
		System.out.println(_a);
	}
}
