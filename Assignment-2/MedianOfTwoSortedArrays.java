import java.util.Arrays;

class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int totalLength = nums1.length + nums2.length;
        int[] ar = new int[totalLength];

        for (int i = 0; i < nums1.length; i++) {
            ar[i] = nums1[i];
        }

        for (int j = 0, i = nums1.length;
             i < totalLength;
             i++, j++) {

            ar[i] = nums2[j];
        }

        Arrays.sort(ar);

        if (totalLength % 2 == 0) {
            return (ar[(totalLength / 2) - 1]
                    + ar[totalLength / 2]) / 2.0;
        } else {
            return ar[totalLength / 2];
        }
    }

    public static void main(String[] args) {

        MedianOfTwoSortedArrays solution =
                new MedianOfTwoSortedArrays();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double result =
                solution.findMedianSortedArrays(nums1, nums2);

        System.out.println("Median: " + result);
    }
}
