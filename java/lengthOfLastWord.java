class lengthOfLastWord {
    public int getLengthOfLastWord(String s) {
        s = s.trim();
        if(s.length()==0){
            return 0;
        }
        String[] arr = s.split(" ");
        // Hello world
        // ["hello","world"]
        return arr[arr.length-1].length();
    }
}