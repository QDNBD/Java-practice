 public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }
        //����ҵ���������ͬ����ֵ�����жϷ���
        if(root1.val == root2.val){
            if(judge(root1,root2)){
                return true;
            }
        }
        //�������ӣ��Һ���
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }
 
    //�ж��Ƿ����ӽṹ
    public boolean judge(TreeNode root, TreeNode subtree) {
        //�ӽṹ�Ѿ�ѭ����ϣ�����ȫ��ƥ��
        if(subtree == null){
            return true;
        }
        //�����Ѿ�ѭ����ϣ���δ�ɹ�ƥ��
        if(root == null){
            return false;
        }
        //��Ⱥ��ж����Һ���
        if(root.val == subtree.val){
            return judge(root.left, subtree.left) && judge(root.right, subtree.right);
        }
        return false;
    }
}