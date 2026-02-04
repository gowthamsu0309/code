class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int i = 0;
        int j = 0;
        if(n == 0 ){
            return true;
        }
        if(t.length() == 0){
            return false;
        }
        while(j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            if(i == n){
                return true;
            }
            j++;
        }
        return false;
    }
}
