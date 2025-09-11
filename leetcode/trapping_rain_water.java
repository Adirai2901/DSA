public class trapping_rain_water {
    // class Solution {
//     public int trap(int[] arr) {
//         int w = 1;
//         int hlp = arr[0];
//         int water = 0;
//         for(int i = 0;i<arr.length;i++){
//             int bpp =0;
//             if(arr[i]>hlp){
//                 hlp = arr[i];
//             }
//             bpp = (hlp-arr[i])*w;
//             water += bpp;
//         }
//         return water;
//     }
// }
// class Solution {
//     public int trap(int[] arr) {
//         int n = arr.length;
//         int water = 0;

//         for(int i = 0; i < n; i++) {
//             int hlp = arr[i];      // left max
//             int right = arr[i];    // right max
//             int bpp = 0;

//             // find left max till i
//             for(int j = 0; j <= i; j++) {
//                 if(arr[j] > hlp) hlp = arr[j];
//             }

//             // find right max till end
//             for(int j = i; j < n; j++) {
//                 if(arr[j] > right) right = arr[j];
//             }

//             bpp = Math.min(hlp, right) - arr[i];
//             water += bpp;
//         }

//         return water;
//     }
// }
class Solution {
    public int trap(int[] arr) {
        int l = 0, r = arr.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;

        while (l <= r) {
            if (arr[l] <= arr[r]) {
                leftMax = Math.max(leftMax, arr[l]);
                water += leftMax - arr[l];
                l++;
            } else {
                rightMax = Math.max(rightMax, arr[r]);
                water += rightMax - arr[r];
                r--;
            }
        }
        return water;
    }
}

}
