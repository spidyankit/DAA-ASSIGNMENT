class BinarySearch {

    public int search(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        BinarySearch solution = new BinarySearch();

        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;

        int result = solution.search(arr, target);

        System.out.println("Index: " + result);
    }
}
