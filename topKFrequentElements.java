class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);
        }
        
        //Heapify way O(n*log(k))
//         PriorityQueue<Integer> pq = new PriorityQueue<>(
//         (n1,n2) -> frequency.get(n1) - frequency.get(n2)
//         );
//         for (int n : frequency.keySet())
//         {
//             pq.add(n);
//             if(pq.size() > k) pq.poll();
//         }
        
//         int[] top = new int[k];
//         for(int i=0; i<k; i++)
//         {
//             System.out.println(top[i]);
//             top[i] = pq.poll();
//         }
//         return top;
        List<Integer> top[] = new List[nums.length];
        
        for (int n : frequency.keySet())
        {
            // System.out.println("Frequency: "+frequency.get(n));
            // System.out.println("Number: "+n);
            List<Integer> curr = top[frequency.get(n)-1];
            // System.out.println("List: "+curr);
            if(curr == null)
            {
                curr = new LinkedList<>();
                curr.add(n);
            }
            else
            {
                curr.add(n);
            }
            top[frequency.get(n)-1] = curr;
        }
        
        int topk[] = new int[k];
        int t=0;
        for(int i=nums.length-1; i>=0; i--)
        {
            if(top[i] != null && t<k)
            {
                System.out.println(top[i]);
                for(int j : top[i])
                {
                    // System.out.println(topk[t]);
                    topk[t++] = j;
                     // System.out.println(topk[t]);
                }
            }
        }
        return topk;
    }
}
