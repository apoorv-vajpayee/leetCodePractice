class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int l =0;
        int r = height.length -1;
        
        while(l<r){
            result = Math.max(result, Math.min(height[l], height[r])*(r-l));
            
            if(height[l] > height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return result;
    }
}
