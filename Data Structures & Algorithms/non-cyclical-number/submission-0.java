class Solution {
    public boolean isHappy(int n) {
        int sum=square(n);
        HashSet<Integer> set=new HashSet<>();
        while(sum!=1){
            if(sum!=1 && set.contains(sum)){
                return false;
            }
            set.add(sum);
            sum=square(sum);
        }
        return true;
    }
    private int square(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit*digit;
            num/=10;
        }
        return sum;
    }
}
