class Solution {
    public int fib(int n) {

        if(n == 0)
            return 0;

        if(n == 1)
            return 1;

         int i = 0;
         int j = 1;

         for(int a = 2; a <= n; a++){
            
            int c = i +j;
            i = j;
            j = c;
         }
         return j;
    }
}
