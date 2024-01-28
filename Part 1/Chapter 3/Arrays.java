class Arrays {
	static void oneDArray() {
		int[] arr1, arr2, arr3;		// The int[] arr syntax is more common for declaring multiple arrays together
		int arr[] = new int[5];		// More common notation for array is int arr[] rather that int[] arr
		int[] ar = {1, 2};			// Initializing the one dimension array
		
		System.out.println(ar[0] + " " + ar[1]);
				
		for(int i=0; i<5; i++)
			System.out.print(arr[i] + " ");
	}
	
	static void twoDArray() {
		int arr[][] = new int[2][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	
	static void multiDArray() {
		int arr[][] = new int[5][];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int[i+1];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	}
}
