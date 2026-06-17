class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        String str1 = str.toLowerCase();
        int left =0,right = str1.length()-1;
        while(left<right){
            if(str1.charAt(left)!=str1.charAt(right)){
                return false;
                }
            left++;
            right--;
        }
            
        return true;
    }
}
