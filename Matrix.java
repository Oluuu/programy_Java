
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 3;
		 
		 boolean[][] array = new boolean[n][n];
		 
		 array[0][0] = true;
		 array[1][1] = true;
		 array[2][2] = true;
		 
		 System.out.println("Prawy dolny element: " + array[array.length - 1][array[array.length - 1].length - 1]);

	}

}
