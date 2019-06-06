class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int resultSize = 0;
        for(int i=0;i<nums1.length;i++){
            result[resultSize] = nums1[i];
            resultSize++;
        }
        for(int i=0;i<nums2.length;i++){
            result[resultSize] = nums2[i];
            resultSize++;
        }
        Arrays.sort(result);
        if(resultSize % 2 !=0){
            return (double)(result[result.length/2]);
        } 
        return ((double)(result[result.length/2-1]) + (double)(result[result.length/2]))/2;
    }
}