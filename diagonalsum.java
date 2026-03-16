public class diagonalsum {
    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum=0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; // Primary diagonal
            if (i != n - 1 - i) { // Avoid double counting the center element in odd-sized matrices
                sum += matrix[i][n - 1 - i]; // Secondary diagonal
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = diagonalSum(matrix);
        System.out.println("Diagonal Sum: " + result);
    }
    
}
