public class euler15 {
	public static void main(String[] args) {
		int gridsize = 20;
		int[][] grid = new int[gridsize][gridsize];
		
		for (int i = 0; i < gridsize; i++) {
			for (int j = 0; j < gridsize; j++) {
				grid[i][j] = 1;
			}
		}
		
		/* for (int i = 0; i < gridsize; i++) {
			for (int j = 0; j < gridsize; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		} */
	}
}