class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(set.size()>k){
                set.remove(nums[start]);
                start++;
            }
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}