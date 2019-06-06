class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int target = 0;
        if(nums.length < 3){
            return result;
        }
        for(int i=0;i<nums.length;i++){
            target = nums[i];
            int[] twoSumResult = twoSum(nums, target);
            if(target + nums[twoSumResult[0]] + nums[twoSumResult[1]] == 0){  
                List<Integer> res = new ArrayList<Integer>();
                res.add(target);
                res.add(nums[twoSumResult[0]]);
                res.add(nums[twoSumResult[1]]);
                if(!result.contains(res)){
                    result.add(res);
                }
            }
        }
        return result;
    }
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map
            = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        int difference = 0;
        for(int i=0;i<nums.length;i++){
            difference = target-nums[i];
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