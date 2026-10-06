class Solution {
    public int maxArea(int[] height) {
        int area=0;
        for(int i=0; i<height.length; i++){
            int w=1;
            int h=1;
            for(int j=i+1; j<height.length; j++){
                w = j - i;
                h = (height[i] > height[j]) ? height[j] : height[i];

                if(area < (w*h)){
                    area = w*h;
                }
            }
        }

        return area;
 
    }
}
