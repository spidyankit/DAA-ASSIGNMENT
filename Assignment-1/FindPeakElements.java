class FindPeakElements {

    public int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        FindPeakElements solution = new FindPeakElements();

        int[] nums = {1, 2, 3, 1};

        int result = solution.findPeakElement(nums);

        System.out.println("Peak Element Index: " + result);
        System.out.println("Peak Element: " + nums[result]);
    }
}
