
class Solution {


    public int[] twoSum(int[] nums, int target) {

    //brute force    
    //     for(int i = 0;i<nums[i];i++){
    //         for(int j=i+1;i<nums[i];j++){
    //         if(nums[i]+nums[j]==target){
    //             return new int[] {i,j};
    //         }
    //         }
    //     }
    // return new int[] {};    
    // }

    //hashmap
  Map<Integer, Integer> seen = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // यदि complement पहले से मैप में मौजूद है
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            
            // वर्तमान नंबर और उसका इंडेक्स मैप में डालें
            seen.put(nums[i], i);
        }
        
        return new int[] {}; // यदि कोई समाधान न मिले
}
}

