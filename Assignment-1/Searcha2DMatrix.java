class Searcha2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = n * m - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int midRow = mid / m;
            int midCol = mid % m;

            if (matrix[midRow][midCol] == target)
                return true;

            else if (matrix[midRow][midCol] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {

        Searcha2DMatrix solution = new Searcha2DMatrix();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        boolean result = solution.searchMatrix(matrix, target);

        System.out.println("Target found: " + result);
    }
}
