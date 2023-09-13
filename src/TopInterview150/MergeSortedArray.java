package TopInterview150;

//88
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            if (n >= 0) System.arraycopy(nums2, 0, nums1, 0, n);
        }
        else{
            int index = m + n - 1;
            while(m > 0 && n > 0){
                if(nums1[m-1]>nums2[n-1]){
                    nums1[index--]=nums1[m-1];
                    m--;
                }
                else{
                    nums1[index--]=nums2[n-1];
                    n--;
                }
            }
        }
        if(m==0){
            if (n >= 0) System.arraycopy(nums2, 0, nums1, 0, n);
        }
    }
}
