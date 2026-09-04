class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        int i=0,j=0,k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length;
        int n = nums2.length;
        int nn = Math.min(m,n);
        int ans[] = new int[nn];

        while(i<m && j<n)
        {
            if(nums1[i] < nums2[j])
            {
                i++;
            }

            else if(nums1[i] > nums2[j])
            {
                j++;
            }

            else
            {
                if(k==0 || ans[k-1] != nums1[i])
                {
                    ans[k++] = nums1[i];
                }

                i++;
                j++;
                
            }
        }

        int idx=0;

        int res[] = new int[k];

        for(idx=0;idx<k;idx++)
        {
            res[idx] = ans[idx];
        }

        return res;

    }
}