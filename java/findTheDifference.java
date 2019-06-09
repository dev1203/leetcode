class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0 && t.length() == 1){
            return t.charAt(0);
        } else if(t.length() == 0 && s.length() ==1){
            return s.charAt(0);
        }
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        if(sArr.length < tArr.length){
            return diffArray(sArr,tArr);
        }
        return diffArray(tArr,sArr);
    }
    public char diffArray(String[] smallArr, String[] largeArr){
        for(int i=0;i<smallArr.length;i++){
            if(!smallArr[i].equals(largeArr[i])){
                return largeArr[i].charAt(0);
            }
        }
        return largeArr[largeArr.length-1].charAt(0);
    }
}