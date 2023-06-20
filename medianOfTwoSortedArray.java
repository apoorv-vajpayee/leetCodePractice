class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int nums[] = new int[n+m];
        int i=0,j=0,k=0;
        
        if(n == 0 && m == 0)
        {
            return 0;
        }
      
        System.out.println("nums1 length "+n);
        System.out.println("nums2 length "+m);
        while(i<n && j<m)
        {
            System.out.println("Inside");
            if(nums1[i] < nums2[j])
            {
                nums[k++] = nums1[i++];
            }
            else
            {
                nums[k++] = nums2[j++];
            }
        }
        
        while(i<n)
        {
            nums[k++] = nums1[i++];
        }
        
        while(j<m)
        {
            nums[k++] = nums2[j++];

        }
        System.out.println("odd flow: "+(m+n-1)/2);
        if((m+n)%2==0)
        {
                System.out.println("even flow1: "+nums[(m+n-1)/2]);
                System.out.println("even flow2: "+nums[((m+n-1)/2)+1]);
                return (float)(nums[(m+n-1)/2] + nums[((m+n-1)/2)+1])/2;
                
        }
        else
        {
                System.out.println("odd flow: "+(m+n-1)/2);
                return nums[(m+n-1)/2];
        }
    }
}
