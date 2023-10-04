package TopInterview150;

//11
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxArea = 0;
        while(i < j){
            int a = height[i];
            int b = height[j];
            int maxHeight = Integer.min(a,b);
            int width = j - i;
            int currArea = maxHeight * width;
            if(currArea > maxArea){
                maxArea = currArea;
            }
            if(a > b){
                j--;
            }
            else{
                i++;
            }
        }
        return maxArea;
    }
}
