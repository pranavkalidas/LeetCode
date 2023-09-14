package TopInterview150;

public class JumpGame2 {
    public int jump(int[] nums) {
        int furthestEnd = 0;
        int currEnd = 0;
        int jump = 0;
        for(int i=0; i<nums.length-1; ++i){
            furthestEnd = Math.max(furthestEnd, i + nums[i]);
            if(i == currEnd){
                currEnd = furthestEnd;
                jump++;
            }
        }
        return jump;
    }

    //Solution Video
    //https://www.youtube.com/watch?v=vBdo7wtwlXs
}
