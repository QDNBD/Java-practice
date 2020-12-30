/*### 121. 买卖股票的最佳时机

给定一个数组，它的第?i 个元素是一支给定股票第 i 天的价格。

如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。

注意：你不能在买入股票前卖出股票。

示例 1:

输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。

示例 2:

输入: [7,6,4,3,1]
输出: 0
解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
*/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 0;i < prices.length;i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}

/*### 70. 爬楼梯

假设你正在爬楼梯。需要 n?阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

示例 1：

输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶


示例 2：

输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶
*/

class Solution {
    public int climbStairs(int n) {
        if(n == 0) {
            return 0;
        }
        int fist = 1;
        int second = 1;
        while(n-- > 1) {
            int temp = fist + second;
            fist = second;
            second = temp;
        }
        return second;
    }
}

/*### 543. 二叉树的直径
给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。

示例 :
给定二叉树
          1
         / \
        2   3
       / \     
      4   5    

返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。

注意：两结点之间的路径长度是以它们之间边的数目表示。

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
*/

class Solution {
    int maxLen = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxLen;
    }
    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftLen = depth(root.left);
        int rightLen = depth(root.right);
        maxLen = Math.max(leftLen + rightLen,maxLen);
        return Math.max(leftLen,rightLen) + 1;
    }
}

/*### 461. 汉明距离

两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。

给出两个整数 x 和 y，计算它们之间的汉明距离。

注意：
0 ≤ x, y < 2^31.

示例:

输入: x = 1, y = 4

输出: 2

解释:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

上面的箭头指出了对应二进制位不同的位置。
*/

class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int temp = x ^ y;
        while(temp != 0) {
            if((temp & 1) == 1) {
                count++;
            }
            temp = temp >> 1;
        }
        return count;
    }
}


/*### 198. 打家劫舍

你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。

?

示例 1：

输入：[1,2,3,1]
输出：4
解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
?    偷窃到的最高金额 = 1 + 3 = 4 。
示例 2：

输入：[2,7,9,3,1]
输出：12
解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
?    偷窃到的最高金额 = 2 + 9 + 1 = 12 。
?

提示：

0 <= nums.length <= 100
0 <= nums[i] <= 400
*/

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}

/*### 226. 翻转二叉树

翻转一棵二叉树。

示例：

输入：

     4
   /   \
  2     7
 / \   / \
1   3 6   9
输出：

     4
   /   \
  7     2
 / \   / \
9   6 3   1


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
*/

利用前序遍历
class Solution {
        // 先序遍历--从顶向下交换
        public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;
            // 保存右子树
            TreeNode rightTree = root.right;
            // 交换左右子树的位置
            root.right = invertTree(root.left);
            root.left = invertTree(rightTree);
            return root;
        }
    }

利用中序遍历
class Solution {
    public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;
            invertTree(root.left); // 递归找到左节点
            TreeNode rightNode= root.right; // 保存右节点
            root.right = root.left;
            root.left = rightNode;
            // 递归找到右节点 继续交换 : 因为此时左右节点已经交换了,
            //所以此时的右节点为root.left
            invertTree(root.left); 
    }
}

利用后序遍历
 class Solution {
        public TreeNode invertTree(TreeNode root) {
            // 后序遍历-- 从下向上交换
            if (root == null) return null;
            TreeNode leftNode = invertTree(root.left);
            TreeNode rightNode = invertTree(root.right);
            root.right = leftNode;
            root.left = rightNode;
            return root;
        }
    }

利用层次遍历
   class Solution {
        public TreeNode invertTree(TreeNode root) {
            // 层次遍历--直接左右交换即可
            if (root == null) return null;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                TreeNode node = queue.poll();
                TreeNode rightTree = node.right;
                node.right = node.left;
                node.left = rightTree;
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            return root;
        }
    }

/*### 160. 相交链表

编写一个程序，找到两个单链表相交的起始节点。

注意：

如果两个链表没有交点，返回 null.
在返回结果后，两个链表仍须保持原有的结构。
可假定整个链表结构中没有循环。
程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。


public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         /**
        定义两个指针, 第一轮让两个到达末尾的节点指向另一个链表的头部, 最后如果相遇则为交点(在第一轮移动中恰好抹除了长度差)
        两个指针等于移动了相同的距离, 有交点就返回, 无交点就是各走了两条指针的长度
        **/
        if(headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        // 在这里第一轮体现在pA和pB第一次到达尾部会移向另一链表的表头, 而第二轮体现在如果pA或pB相交就返回交点, 不相交最后就是null==null
        while(pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if (headA == null || headB == null) {
            return null;
      }
        ListNode pL = headA;
        ListNode pS = headB;

        int lenA = 0;
        int lenB = 0;

        //算长度
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;

        int len = lenA - lenB;
        if (len < 0) {
            pL = headB;
            pS = headA;
            len = lenB - lenA;
        }

        //pL先走len步
        while ( len > 0) {
            pL = pL.next;
            len--;
        }
        //一人一步走
        while (pL != null && pS != null && pL != pS) {
            pL = pL.next;
            pS = pS.next;
        }
        if (pL == pS && pL == null) {
            return null;
        }
        return pL;
    }
}


/*### 141. 环形链表

给定一个链表，判断链表中是否有环。

如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。

如果链表中存在环，则返回 true 。 否则，返回 false 。

?

进阶：

你能用 O(1)（即，常量）内存解决此问题吗？

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}

/*### 20. 有效的括号

给定一个只包括 '('，')'，'{'，'}'，'['，']'?的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例?2:

输入: "()[]{}"
输出: true
示例?3:

输入: "(]"
输出: false
示例?4:

输入: "([)]"
输出: false
示例?5:

输入: "{[]}"
输出: true
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.trim().toCharArray();
        for(char ch : chars) {
            if(ch == '(') {
                stack.push(')');
            }else if(ch == '[') {
                stack.push(']');
            }else if(ch == '{') {
                stack.push('}');
            }else if(stack.isEmpty() || stack.pop() != ch){
                return false;
            }
        } 
        return stack.isEmpty();
    }
}
