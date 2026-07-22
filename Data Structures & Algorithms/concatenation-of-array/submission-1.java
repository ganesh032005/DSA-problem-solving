class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int[] num = new int[n];
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
        }
        int index=nums.length;
        for(int i=0;i<nums.length;i++){
            num[index]=nums[i];
            index++;
        }
        return num;
    }
}