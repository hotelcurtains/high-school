class Main {
  public static void main(String[] args) {
		int uno[][] = { {51, 15, 73}, 
									 	{13, 85, 34} };
		int dos[][] = { {12, 36}, 
									 	{27, 39}, 
									 	{84, 41} };
		
		System.out.println("\nMatrix A (2x3):");
		printMatrix(uno);
		System.out.println("Matrix B (3x2):");
		printMatrix(dos);
		
		System.out.println("Result of A*B (2x2):");
		printMatrix(multiplyMatrices(uno, dos));
		System.out.println("Result of B*A (3x3):");
		printMatrix(multiplyMatrices(dos, uno));
	}
	
	public static void printMatrix(int A[][]) {
		for( int row=0; row<A.length; row++) {
			for( int col=0; col<A[0].length; col++) {
				System.out.print( A[row][col] + " " );
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int[][] multiplyMatrices(int[][] A, int[][] B) {
		 int[][] product = new int[A.length][B[0].length];
		 for(int i = 0; i < A.length; i++) {
			 for (int j = 0; j < B[0].length; j++) {
				 for (int k = 0; k < A[0].length; k++) {
					 product[i][j] += A[i][k] * B[k][j];
				 }
			 }
		 }
		 return product;
	}
	
}