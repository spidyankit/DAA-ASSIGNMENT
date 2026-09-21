class Solution {

    public int searchInsert(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr = {1, 3, 5, 6};
        int target = 2;

        int result = solution.searchInsert(arr, target);

        System.out.println("Insert Position: " + result);
    }
}
