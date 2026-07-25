class Solution {
    public int maxProduct(int n) {
        int m1 = -1, m2 = -1;
       int s=0;
        while(n > 0){
           s = n % 10;
           if(s >= m1){
            m2 = m1;
            m1 = s;
           } else if ( s > m2){
            m2 = s;
           }
         
           n = n /10;
        }
        return m1*m2;
    }
}