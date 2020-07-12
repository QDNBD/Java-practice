import java.util.TreeSet;

public class TestDamo {
    public static void mystery(int x) {
        System.out.print(x %10);
        if ((x/10)!=0){
            mystery(x/10);
        }
        System.out.print(x%10);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        Solution solution = new Solution();
        System.out.println(Solution.enumerate(nums1));

    }

    public static void main2(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Solution solution = new Solution();
        solution.merge1(nums1,3,nums2,3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
        }
        //System.out.println(solution.lengthOfLastWord(" a b aaaaaaaa    "));
       // solution.isPalindrome('3');
        //System.out.println(solution.canConstruct("",""));
        //solution.rotate(nums,3);
  //      System.out.println(solution.toLowerCase("HEllo"));


    }

    public static void main1(String[] args) {
        mystery(1234);
//        int x = 20;
//        int y = 5;
//        System.out.println(x+y + ""+(x+y)+y);
    }
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while(digits[i] == 9){
            if(digits[i] == 9) {
                digits[i] = 0;
                i--;
            }
        }
        digits[i] = digits[i] +1;

        return digits;
    }

    private long MIN = Long.MIN_VALUE;    // MIN代表没有在值

    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) throw new RuntimeException("nums is null or length of 0");
        int n = nums.length;

        int one = nums[0];
        long two = MIN;
        long three = MIN;

        for (int i = 1; i <  n; i++) {
            int now = nums[i];
            if (now == one || now == two || now == three) continue;    // 如果存在过就跳过不看
            if (now > one) {
                three = two;
                two = one;
                one = now;
            } else if (now > two) {
                three = two;
                two = now;
            } else if (now > three) {
                three = now;
            }
        }

        if (three == MIN) return one;  // 没有第三大的元素，就返回最大值
        return (int)three;
    }


    public int thirdMax1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (Integer elem : nums) {
            set.add(elem);
            if (set.size() > 3) set.remove(set.first());
        }

        return set.size() < 3 ? set.last() : set.first();   // set.last() 里面最大的元素
    }





    public int compress(char[] chars) {     // 数组大小范围： 1 <= chars.length <= 1000
        int left = 0;
        int size = 0;

        // 由于最后一个字符也需要判断，所以将右指针终点放到数组之外一格
        for (int right = 0; right <= chars.length; right++) {
            // 当遍历完成，或右指针元素不等于左指针元素时，更新数组
            if (right == chars.length || chars[right] != chars[left]) {
                chars[size++] = chars[left];    // 更新字符
                if (right - left > 1) {         // 更新计数，当个数大于 1 时才更新
                    for(char c : String.valueOf(right - left).toCharArray()) {
                        chars[size++] = c;
                    }
                }
                left = right;
            }
        }

        return size;
    }






}
