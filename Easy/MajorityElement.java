class Solution {
    public int majorityElement(int[] nums) {
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        for(int temp : nums)
        hm.put(temp,hm.getOrDefault(temp,0)+1);
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            if(e.getValue()>nums.length/2)return e.getKey();
        }
        return -1;
    }
}