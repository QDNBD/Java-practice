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
            // �ݹ��ҵ��ҽڵ� �������� : ��Ϊ��ʱ���ҽڵ��Ѿ�������,���Դ�ʱ���ҽڵ�Ϊroot.left
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