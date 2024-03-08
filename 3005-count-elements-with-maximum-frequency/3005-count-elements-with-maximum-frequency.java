class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        int maxFrequency = 0;
        int count=0;
        
        for (int k : map.keySet()) {
            int frequency = map.get(k);
            maxFrequency = Math.max(maxFrequency, frequency);
           
        }
        for(int freq : map.values()){
            if(freq==maxFrequency){
                count++;
            }
        }
        
        return count*maxFrequency;
                                                  
        
    }
}