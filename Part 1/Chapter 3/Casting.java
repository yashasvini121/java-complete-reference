class Casting {
	
	static void errorBecauseOfAutomaticConversions() {
		byte b=2;
		// b = b*2;
		// byte != int
		
		b = (byte)(b*2);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// Types: widening conversion and narrowing conversions
		int a=10;
		byte b = (byte) a;
		System.out.println(a + " " + b);
			
		errorBecauseOfAutomaticConversions();
	}
}
