class Solution {
    public int maxProduct(int[] nums) {
        int p=0,k =0;
        int max=0;
        for (int i =0; i < nums.length;i++){
            for (int j =i +1; j< nums.length;j++){
             p =nums[i] * nums[j];
             if(p > max){
            max =p;
             }
            }
        }
        for (int i =0; i < nums.length;i++){
            for (int j =i+1; j< nums.length;j++){
            if ( nums[i] * nums[j] == max)
             k = (nums[i]-1 )* (nums[j]-1);
            }
        }
        

        return k;
    }
}