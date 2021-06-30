class Solution {
    public int trap(int[] height) {
        if(height.length == 1) {
            return 0;
        }
        int temp[] = new int[height.length];
        int max = 0;
        int sum = 0;
        for(int i=0;i<height.length;i++) {
            max = Math.max(max,height[i]);
            temp[i] = max;
        }
        max = 0;
        for(int i= height.length -1; i>=0;i--) {
            max = Math.max(max, height[i]);
            int minV = Math.min(max,temp[i]);
            sum+=(minV-height[i]);
        }
        return sum >= 0 ? sum : 0;
    }
}
