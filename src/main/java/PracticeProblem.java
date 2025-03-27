public class PracticeProblem {

	public static int sum2D(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }

	public static int sumRow(int[][] array, int row) {
        int sum = 0;
        for (int num : array[row]) {
            sum += num;
        }
        return sum;
    }

	public static int sumColumn(int[][] array, int col) {
        int sum = 0;
        for (int[] row : array) {
                sum += row[col];
        }
        return sum;
    }
}
