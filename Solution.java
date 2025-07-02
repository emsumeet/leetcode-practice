class Soultion{
    public int mysqrt(int x) {
        if(x< 2) return x;

        //base case
        int left = 1; 
        int right = x/2; 
        int ans = 0;
        while(left<=right){
            int i = left +(right -left) /2;
            if( i <= x/ i){
                ans = i;
                left = i+1;
            }
            else
            {
                right = i -1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Soultion sol = new Soultion();
         int num = 16;
         System.out.println("Sqr root of" + num + "is" + sol.mysqrt(num));

         num = 8;
         System.out.println("Square root of " + num + " is " + sol.mysqrt(num));

         num = 0;
         System.out.println("Square root of " + num + " is " + sol.mysqrt(num));
    }
}
