public class Solution {
    public int RectCover(int target) {
//         if(target <= 0) {
//             return 0;
//         }
//         if(target <= 2) {
//             return target;
//         }
//         return RectCover(target-1) + RectCover(target-2);
        
        int first = 1;
        int second = 2;
        int third = target;
        while(target > 2) {
            third = second + first;
            first = second;
            second = third;
            target--;
        }
        return third;
    }
}