class Solution {
    public boolean hasDuplicate(int[] nums) {
      ArrayList<Integer> num = new ArrayList<Integer>();
      for(int i=0;i<nums.length;i++){
        num.add(nums[i]);
      }
       for(int i=0;i<num.size();i++){
          if(num.indexOf(num.get(i))!=num.lastIndexOf(num.get(i)))
             return true;
           }
           return false;
       }
}