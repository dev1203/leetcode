import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map 
            = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        int difference;
        for(int i=0;i<nums.length;i++){
            difference = target - nums[i];
            if(map.containsKey(difference)){
                result[0] = i;
                result [1] = map.get(difference);
                return result;
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }
}