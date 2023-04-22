/*
1470. Shuffle the Array


Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        for(int i = 0; i< 2*n; i++) {

            //The left-half of the initial array (x1,x2,....) occupies the even index positions in the resultant array
            //Fill them first
            if(i%2 == 0) {
                ans[i] = nums[i/2];
            }

            //The right-half of the initial array (y1,y2,....) occupies the even index positions in the resultant array
            //Fill them now
            else{
                ans[i] = nums[n+i / 2];
            }
            
        }
        return ans;
    }
}
