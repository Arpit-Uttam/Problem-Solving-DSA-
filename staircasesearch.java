public class staircasesearch {
    public static boolean search(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Target found
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        System.out.println("Target " + target + " not found in the matrix.");
        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 10;
        boolean result = search(matrix, target);
        System.out.println("Target " + target + " found: " + result);
    }
    
}
