class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<nums.length; i++)
        {
            pq.add(nums[i]);
        }
        
        int t=0;

        while( !(pq.isEmpty()) )
        {
            int j = pq.poll();
            t++;
            if(t == k)
            {
                return j;
            }
        }
        return -1;
    }
}
