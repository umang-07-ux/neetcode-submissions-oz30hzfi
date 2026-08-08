class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        String str=s;
        String rev="";
        int n=s.length();
        for(int i=n-1;i>=0;i--) {
            char c=s.charAt(i);
            rev=rev+c;
        }
        if(str.equals(rev)) {
            return true;
        }
        return false;
    }
}
