/*### 121. ������Ʊ�����ʱ��

����һ�����飬���ĵ�?i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�

��������ֻ�������һ�ʽ��ף������������һ֧��Ʊһ�Σ������һ���㷨�����������ܻ�ȡ���������

ע�⣺�㲻���������Ʊǰ������Ʊ��

ʾ�� 1:

����: [7,1,5,3,6,4]
���: 5
����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
     ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�ͬʱ���㲻��������ǰ������Ʊ��

ʾ�� 2:

����: [7,6,4,3,1]
���: 0
����: �����������, û�н������, �����������Ϊ 0��
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

/*### 70. ��¥��

������������¥�ݡ���Ҫ n?������ܵ���¥����

ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�

ע�⣺���� n ��һ����������

ʾ�� 1��

���룺 2
����� 2
���ͣ� �����ַ�����������¥����
1.  1 �� + 1 ��
2.  2 ��


ʾ�� 2��

���룺 3
����� 3
���ͣ� �����ַ�����������¥����
1.  1 �� + 1 �� + 1 ��
2.  1 �� + 2 ��
3.  2 �� + 1 ��
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

/*### 543. ��������ֱ��
����һ�ö�����������Ҫ��������ֱ�����ȡ�һ�ö�������ֱ�������������������·�������е����ֵ������·�����ܴ���Ҳ���ܲ���������㡣

ʾ�� :
����������
          1
         / \
        2   3
       / \     
      4   5    

���� 3, ���ĳ�����·�� [4,2,1,3] ���� [5,2,1,3]��

ע�⣺�����֮���·��������������֮��ߵ���Ŀ��ʾ��

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

/*### 461. ��������

��������֮��ĺ�������ָ�������������ֶ�Ӧ������λ��ͬ��λ�õ���Ŀ��

������������ x �� y����������֮��ĺ������롣

ע�⣺
0 �� x, y < 2^31.

ʾ��:

����: x = 1, y = 4

���: 2

����:
1   (0 0 0 1)
4   (0 1 0 0)
       ��   ��

����ļ�ͷָ���˶�Ӧ������λ��ͬ��λ�á�
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


/*### 198. ��ҽ���

����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݡ�ÿ�䷿�ڶ�����һ�����ֽ�Ӱ����͵�Ե�Ψһ��Լ���ؾ������ڵķ���װ���໥��ͨ�ķ���ϵͳ������������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������

����һ������ÿ�����ݴ�Ž��ķǸ��������飬������ ����������װ�õ������ ��һҹ֮���ܹ�͵�Ե�����߽�

?

ʾ�� 1��

���룺[1,2,3,1]
�����4
���ͣ�͵�� 1 �ŷ��� (��� = 1) ��Ȼ��͵�� 3 �ŷ��� (��� = 3)��
?    ͵�Ե�����߽�� = 1 + 3 = 4 ��
ʾ�� 2��

���룺[2,7,9,3,1]
�����12
���ͣ�͵�� 1 �ŷ��� (��� = 2), ͵�� 3 �ŷ��� (��� = 9)������͵�� 5 �ŷ��� (��� = 1)��
?    ͵�Ե�����߽�� = 2 + 9 + 1 = 12 ��
?

��ʾ��

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

/*### 226. ��ת������

��תһ�ö�������

ʾ����

���룺

     4
   /   \
  2     7
 / \   / \
1   3 6   9
�����

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

����ǰ�����
class Solution {
        // �������--�Ӷ����½���
        public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;
            // ����������
            TreeNode rightTree = root.right;
            // ��������������λ��
            root.right = invertTree(root.left);
            root.left = invertTree(rightTree);
            return root;
        }
    }

�����������
class Solution {
    public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;
            invertTree(root.left); // �ݹ��ҵ���ڵ�
            TreeNode rightNode= root.right; // �����ҽڵ�
            root.right = root.left;
            root.left = rightNode;
            // �ݹ��ҵ��ҽڵ� �������� : ��Ϊ��ʱ���ҽڵ��Ѿ�������,
            //���Դ�ʱ���ҽڵ�Ϊroot.left
            invertTree(root.left); 
    }
}

���ú������
 class Solution {
        public TreeNode invertTree(TreeNode root) {
            // �������-- �������Ͻ���
            if (root == null) return null;
            TreeNode leftNode = invertTree(root.left);
            TreeNode rightNode = invertTree(root.right);
            root.right = leftNode;
            root.left = rightNode;
            return root;
        }
    }

���ò�α���
   class Solution {
        public TreeNode invertTree(TreeNode root) {
            // ��α���--ֱ�����ҽ�������
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

/*### 160. �ཻ����

��дһ�������ҵ������������ཻ����ʼ�ڵ㡣

ע�⣺

�����������û�н��㣬���� null.
�ڷ��ؽ���������������뱣��ԭ�еĽṹ��
�ɼٶ���������ṹ��û��ѭ����
���������� O(n) ʱ�临�Ӷȣ��ҽ��� O(1) �ڴ档


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
        ��������ָ��, ��һ������������ĩβ�Ľڵ�ָ����һ�������ͷ��, ������������Ϊ����(�ڵ�һ���ƶ���ǡ��Ĩ���˳��Ȳ�)
        ����ָ������ƶ�����ͬ�ľ���, �н���ͷ���, �޽�����Ǹ���������ָ��ĳ���
        **/
        if(headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        // �������һ��������pA��pB��һ�ε���β����������һ����ı�ͷ, ���ڶ������������pA��pB�ཻ�ͷ��ؽ���, ���ཻ������null==null
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

        //�㳤��
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

        //pL����len��
        while ( len > 0) {
            pL = pL.next;
            len--;
        }
        //һ��һ����
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


/*### 141. ��������

����һ�������ж��������Ƿ��л���

�����������ĳ���ڵ㣬����ͨ���������� next ָ���ٴε���������д��ڻ��� Ϊ�˱�ʾ���������еĻ�������ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ���� ��� pos �� -1�����ڸ�������û�л���ע�⣺pos ����Ϊ�������д��ݣ�������Ϊ�˱�ʶ�����ʵ�������

��������д��ڻ����򷵻� true �� ���򣬷��� false ��

?

���ף�

������ O(1)�������������ڴ�����������

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

/*### 20. ��Ч������

����һ��ֻ���� '('��')'��'{'��'}'��'['��']'?���ַ������ж��ַ����Ƿ���Ч��

��Ч�ַ��������㣺

�����ű�������ͬ���͵������űպϡ�
�����ű�������ȷ��˳��պϡ�
ע����ַ����ɱ���Ϊ����Ч�ַ�����

ʾ�� 1:

����: "()"
���: true
ʾ��?2:

����: "()[]{}"
���: true
ʾ��?3:

����: "(]"
���: false
ʾ��?4:

����: "([)]"
���: false
ʾ��?5:

����: "{[]}"
���: true
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
