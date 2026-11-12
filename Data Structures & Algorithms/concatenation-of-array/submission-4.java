class Solution {
    public int[] getConcatenation(int[] nums) {
        int N=nums.length*2;
        int n=nums.length;
        int[] number=new int[N];
        for(int i=0;i<nums.length;i++){
            number[i]=nums[i];
        }
        for(int i=nums.length;i<N;i++){
            number[i]=nums[i-n];
        }
        return number;
    }
}