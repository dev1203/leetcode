class Solution {
    public boolean isIsomorphic(String s, String t) {
        return check(s,t) && check(t,s);
    }
    public boolean check(String s, String t){
                HashMap<Character, Character> map = new             HashMap<Character,Character>();
        for(int i =0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                char temp = map.get(s.charAt(i));
                if(temp != t.charAt(i)){
                    return false;
                }
            } else{
                map.put(s.charAt(i),t.charAt(i));    
            }
        }
        return true;
    }
}