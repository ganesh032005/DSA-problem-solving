class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        char[]a=s.toCharArray();
        for(char x:a){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        char[] b=t.toCharArray();
        for(char y:b){
            if(!map.containsKey(y) || map.get(y)==0){
                return false;
            }
            map.put(y,map.get(y)-1);
        }
        return true;
    }
}
