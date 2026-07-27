class Solution {
    int start = 0;
    int maxLen = 0;
    public String longestPalindrome(String s) {

        // BRUTE APPROACH

    //     String ans = "";

    //     for(int i = 0; i < s.length(); i++){
    //         for(int j = i; j < s.length(); j++){
    //             String str = s.substring(i, j+1);

    //             if(isPalindrome(str) && str.length() > ans.length()) {
    //                 ans =str;
    //             }
    //         }
    //     }
    //     return ans ;
    // }
    // public boolean isPalindrome(String str){
    //     int left = 0;
    //     int right = str.length()-1;

    //     while(left < right){
    //         if(str.charAt(left) != str.charAt(right)){
    //             return false;
    //         }
    //         left ++;
    //         right--;
    //     }
    //     return true;
     
    //  OPTIMAL
      for( int i =0; i<s.length(); i++){

        expand(s,i,i);
        expand(s,i,i+1);
        }

        return s.substring(start,start+maxLen);
    }
    public void expand(String s, int left, int right) {

        while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)) {

            left --;
            right++;
        }

        int len = right -left -1;

        if(len>maxLen){
            maxLen = len;
            start = left + 1;
        }
    
    }
}