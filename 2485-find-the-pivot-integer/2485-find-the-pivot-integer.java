class Solution {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        
        int si = 1;
        int ei = n;
        
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            
            int sumn = n * (n + 1) / 2;
            int sum1 = mid * (mid + 1) / 2;
            int sum2 = sumn - sum1 + mid;
            
            if (sum1 == sum2) {
                return mid;
            } else if (sum1 < sum2) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        
        return -1; // return -1 if no pivot integer is found
    }
}
