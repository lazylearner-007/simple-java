class Solution {
    public void reverseString(char[] s) {
        int limit = s.length;
        
        for(int i=0;i<limit/2;i++){
            char temp = s[i];
            s[i] = s[limit-i-1];
            s[limit-i-1] = temp;
        }
    }
}
