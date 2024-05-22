class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=0;
        int len1 = nums1.length;
        int len2 = nums2.length;

        int arr[] = new int[len1+len2];

        for(int i=0;i<nums1.length;i++)
           arr[k++] = nums1[i];

        for(int i=0;i<nums2.length;i++)
           arr[k++] = nums2[i];

        Arrays.sort(arr);
        int len = arr.length;

        if(len%2 != 0)
           return (double) arr[len/2];
        else
          return ((double)arr[len/2]+(double)arr[len/2-1])/2.0;
    }
}