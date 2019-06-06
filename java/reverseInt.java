class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        int reversed = 0;
        int lastDigit = 0;
        if(x< 0){
            isNegative = true;
            x = Math.abs(x);
        } 
        int xValue = x;
        while(x!=0){
            lastDigit = x % 10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0;
            reversed = reversed * 10 + lastDigit;
            
            x = x/10;
        }
        return isNegative ? -1 * reversed : reversed;
    }
    
}

/**
 * class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if(len(nums) == 0):
            return 0
        elif(len(nums) == 1):
            return 1
        else:
            for i in range(0,len(nums)):
                print(nums[i])
                
        
 */