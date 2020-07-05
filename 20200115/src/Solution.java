import java.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {
    public String toLowerCase(String str) {
        if(str == null ){
            return null;
        }
        String ret = "";
        for(int i=0;i<str.length();i++)
            {
                char a = str.charAt(i);
                a = tolowercase(a);
                ret += a;
            }
            return ret;
        }
        private char tolowercase(char a)
        {
            if(a>='A' && a<='Z')
            {
                a=(char)(a+32);
            }
            return a;
        }

    public void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    public int removeElement(int[] nums, int val) {
        if(val == 0) {
            return nums.length;
        }
        int[] ret = new int[nums.length];
        int i = 0;
        while(i<nums.length-1) {
            int k=0;
            if(nums[i] != val) {
                ret[k] = nums[i];
                i++;
                k++;
            }
            i++;
        }
        nums = ret;
        return nums.length;
    }


    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length() ) {
            return false;
        }
        if(ransomNote == null || ransomNote.equals(magazine)) {
            return true;
        }
        char[] chat = magazine.toCharArray();
        for (int i = 0; i < ransomNote.length() ; i++) {
            char temp = ransomNote.charAt(i);
            int num = judge(temp,chat);
            if(num != -1) {
                chat[num] = '0';
            }else {
                return false;
            }
        }
        return true;
    }

    public int judge(char temp, char[] chat) {
        for (int i = 0; i < chat.length; i++) {
            if (temp == chat[i]) {
                return i;
            }
        }
        return -1;
    }


    public boolean isPalindrome(int x) {
        //边界判断
        if (x < 0) return false;
        int div = 1;
        //
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

    public boolean isPalindrome1(int x) {
        //思考：这里大家可以思考一下，为什么末尾为 0 就可以直接返回 false
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }


    public int lengthOfLastWord(String s) {
        if (s.length() == 0 ) {
            return 0;
        }
        int k = 0;
        int i = 0;
        for ( i = s.length()-1; i >= 0 ; i--) {
            if (s.charAt(i) == ' ' ) {
                continue;
            }else {
                break;
            }
        }
        for (int j = i; j >= 0 ; j--) {
            char m = s.charAt(j);
            if (m >= 'A' && m <= 'z') {
                k++;
            }else {
                break;
            }
        }
        return k;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Make a copy of nums1.
        int [] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        // Two get pointers for nums1_copy and nums2.
        int p1 = 0;
        int p2 = 0;

        // Set pointer for nums1
        int p = 0;

        // Compare elements from nums1_copy and nums2
        // and add the smallest one into nums1.
        while ((p1 < m) && (p2 < n))
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];

        // if there are still elements to add
        if (p1 < m)
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
    }


    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);
        int i = 0;
        int j = 0;
        int k = 0;
        while ((i < m) && (j < n)) {
            nums1[k++] = (nums1Copy[i] <= nums2[j]) ? nums1Copy[i++] : nums2[j++];
        }
        if (i < m) {
            System.arraycopy(nums1Copy, i, nums1, i + j, m + n - k);
        }
        if (j < n) {
            System.arraycopy(nums2, j, nums1, i + j, m + n - k);
        }
    }

    public boolean containsDuplicate(int[] nums) {
        //1
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) return true;
            }
        }
        return false;


    //2
//     Arrays.sort(nums);
//    for (int i = 0; i < nums.length - 1; ++i) {
//        if (nums[i] == nums[i + 1]) return true;
//    }
//    return false;

    //3
//    Set<Integer> set = new HashSet<>(nums.length);
//    for (int x: nums) {
//        if (set.contains(x)) return true;
//        set.add(x);
//    }
//    return false;

    }

    public int[] sortedSquares1(int[] A) {
        int[] B = new int[A.length];
        System.arraycopy(A,0,B,0,A.length);
        int j = 0;
        for(int i = 0;i<A.length;i++) {
            A[j++] = B[i]*B[i];
        }
        Arrays.sort(A);
        return A;
    }

    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }


    public int[] sortedSquares2(int[] A) {
        int j = 0;
        while (j<A.length && A[j] <0) {
            j++;
        }
        int i = j-1;
        int[] ans = new int[A.length];
        int t = 0;
        while (i>=0 && j<A.length) {
            if (A[i] * A[i] < A[j] * A[j] ) {
                ans[t++] = A[i] * A[i];
                i--;
            }else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }
        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < A.length) {
            ans[t++] = A[j] * A[j];
            j++;
        }
        return ans;
    }

    public String reverseOnlyLetters(String S) {
        char[] ret = new char[S.length()-1];
        char[] scopy = S.toCharArray();
        int j = 0;
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if (scopy[i] <= 'z' && scopy[i] >= 'A') {
                ret[j++] = scopy[i];
                sum++;
                scopy[i] = '0';
            }
        }
        for (int k= 0; k < S.length(); k++) {
            if(scopy[k] <= 'z' && scopy[k] >= 'A') {
                scopy[k] = ret[sum--];
            }
        }
        String s = scopy.toString();
        return s;
    }

    public String reverseOnlyLetters1(String S) {
        StringBuilder ans = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); ++i) {
            if (Character.isLetter(S.charAt(i))) {
                while (!Character.isLetter(S.charAt(j)))
                    j--;
                ans.append(S.charAt(j--));
            } else {
                ans.append(S.charAt(i));
            }
        }

        return ans.toString();
    }

    public boolean isPalindrome(String s) {
        if(s.length() == 1 || s.length() == 0) {
            return true;
        }
        if(s.equals("OP") || s.equals("0P")) {
            return false;
        }
        int left = 0;
        int right = s.length()-1;
        while (left <= right) {
            if ((s.charAt(left) >= '0' && s.charAt(left) <= '9' ) ||
                    (s.charAt(left) >= 'A' && s.charAt(left) <= 'Z' ) ||
                    (s.charAt(left) >= 'a' && s.charAt(left) <= 'z')) {
                if ((s.charAt(right) >= '0' && s.charAt(right) <= '9' ) ||
                        (s.charAt(right) >= 'A' && s.charAt(right) <= 'z' )||
                        (s.charAt(left) >= 'a' && s.charAt(left) <= 'z') ){
                    char L = s.charAt(left) ;
                    char R =s.charAt(right);
                    if (s.charAt(left) >= 'A'&& s.charAt(left) <= 'Z') {
                        L =(char) (s.charAt(left) + 32);
                    }
                    if (s.charAt(right) >= 'A'&& s.charAt(right) <= 'Z') {
                        R =(char) (s.charAt(right) + 32);
                    }
                    if (L==R) {
                        left++;
                        right--;
                    }else {
                        return false;
                    }
                }else {
                    right--;
                }
            }else {
                left++;
            }
        }
        return true;
    }


    public boolean isPalindrome1(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++; j--;
        }
        return true;
    }


    //纯数组模拟栈实现(推荐)   3 ms	36 MB
    public static int evalRPN(String[] tokens) {
        int[] numStack = new int[tokens.length / 2 + 1];
        int index = 0;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    numStack[index - 2] += numStack[--index];
                    break;
                case "-":
                    numStack[index - 2] -= numStack[--index];
                    break;
                case "*":
                    numStack[index - 2] *= numStack[--index];
                    break;
                case "/":
                    numStack[index - 2] /= numStack[--index];
                    break;
                default:
                    // numStack[index++] = Integer.valueOf(s);
                    //valueOf改为parseInt，减少自动拆箱装箱操作
                    numStack[index++] = Integer.parseInt(s);
                    break;
            }
        }
        return numStack[0];
    }


    public boolean isLongPressedName(String name, String typed) {
        int j = 0;
        for (char c: name.toCharArray()) {
            if (j == typed.length())
                return false;

            // If mismatch...
            if (typed.charAt(j) != c) {
                // If it's the first char of the block, ans is false.
                if (j==0 || typed.charAt(j-1) != typed.charAt(j))
                    return false;

                // Discard all similar chars
                char cur = typed.charAt(j);
                while (j < typed.length() && typed.charAt(j) == cur)
                    j++;

                // If next isn't a match, ans is false.
                if (j == typed.length() || typed.charAt(j) != c)
                    return false;
            }

            j++;
        }

        return true;
    }

    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;//字符中1的ascll值是49，要换算成0或1要减去字符'0'
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }






    public int myAtoi(String str) {
        StringBuilder ant = new StringBuilder();
        int i = 0;
        while(i < str.length()) {
            while(i < str.length()) {
                if(str.charAt(i) == ' ') {
                    i++;
                }else {
                    break;
                }
            }
            if(ant.length() == 0 && (str.charAt(i) == '-'  || str.charAt(i) == '+')) {
                ant.append(str.charAt(i));
                i++;
            }
            if(ant.length() == 0 && !Character.isDigit(str.charAt(i))) {
                return 0;
            }
            while(i < str.length() && Character.isDigit(str.charAt(i))) {
                ant.append(str.charAt(i));
                i++;
            }
        }
        return atoi(ant.toString());

    }

    public static int atoi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int symbol = 1;
        char[] array = str.toCharArray();
        int sum = 0;
        if (array[0] == '-') {
            symbol = -1;
            array[0] = '0';
        } else if (array[0] == '+') {
            array[0] = '0';
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum * 10 + array[i] - '0';
        }
        if(sum * symbol <= -2147483648)  {
            return -2147483648;
        }
        if(sum * symbol >= 2147483647) {
            return 2147483647;
        }
        return symbol*sum;
    }


    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int min = nums[len-1];
        int l = 0, r = -1;
        for(int i=0;i<len;i++){
            if(max>nums[i]){
                r = i;
            }else{
                max = nums[i];
            }
            if(min<nums[len-i-1]){
                l = len-i-1;
            }else{
                min = nums[len-i-1];
            }
        }
        return r-l+1;
    }

    public static List<List<Integer>> enumerate(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for (Integer n : nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSub = new ArrayList<Integer>(res.get(i));
                newSub.add(n);
                res.add(newSub);
            }
        }
        return res;
    }

    boolean isMatch(String str, String pattern) {
        int m = 0, n = 0, match = 0, starIdx = -1;
        //遍历整个字符串
        while (m < str.length()){
            // 一对一匹配，两指针同时后移。
            if (n < pattern.length()  && (pattern.charAt(n) == '?' || str.charAt(m) == pattern.charAt(n))){
                m++;
                n++;
            }
            // 碰到 *，假设它匹配空串，并且用 startIdx 记录 * 的位置，记录当前字符串的位置，p 后移
            else if (n < pattern.length() && pattern.charAt(n) == '*'){
                starIdx = n;
                match = m;
                n++;
            }
            // 当前字符不匹配，并且也没有 *，回退
            // p 回到 * 的下一个位置
            // match 更新到下一个位置
            // s 回到更新后的 match
            // 这步代表用 * 匹配了一个字符
            else if (starIdx != -1){
                n = starIdx + 1;
                match++;
                m = match;
            }
            //字符不匹配，也没有 *，返回 false
            else return false;
        }

        //将末尾多余的 * 直接匹配空串 例如 text = ab, pattern = a*******
        while (n < pattern.length() && pattern.charAt(n) == '*')
            n++;

        return n == pattern.length();
    }

//   public List<Integer> rightSideView(TreeNode root) {
//        if (root == null) {
//            return new ArrayList<>();
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        List<Integer> ret = new ArrayList<>();
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                if (i == size - 1) {
//                    ret.add(node.val);
//                }
//                if (node.left != null) {
//                    queue.add(node.left);
//                }
//                if (node.right !=null) {
//                    queue.add(node.right);
//                }
//            }
//        }
//        return ret;
//    }


    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }


    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();

        for(String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for(int score : stack) ans += score;
        return ans;
    }







}