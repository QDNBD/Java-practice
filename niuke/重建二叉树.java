public class Solution {
    public TreeNode reConstructBinaryTreeCore(int[] pre,int pre_star,int pre_end,int[] in,int in_star,int in_end){
        if(pre_star > pre_end || in_star > in_end) {
            return null;
        }
        TreeNode root = new TreeNode(pre[pre_star]);
        int i = in_star;
        for(;i <= in_end;i++) {//�����������У��Ҹ��ڵ㣬���Խ����黮��Ϊ������
            if(in[i] == pre[pre_star]) {
            //ǰ��ĵ�һ���ڵ㣬��root���ܽ����򻮷�Ϊ������
            //һ����������ǰ���У�����ô������Ԫ�صĸ����ǲ����
            //��ʵ�ʱ�����ʱ��ǰ���У�������������ֱ�����ʽ���������Ľڵ㶼����һ���
            //���������ص���Ҫ������±�����
            //��������������ȷ���������Ľڵ�����ǣ�i - inStart (û�д�0��ʼŶ)
            //���ԣ���Ҫ��preStart+1������i - inStart��Ԫ�أ�������������ǰ������
                root.left = reConstructBinaryTreeCore(pre,pre_star+1,i-in_star+pre_star,in,in_star,i-1);
                root.right = reConstructBinaryTreeCore(pre,i-in_star+pre_star+1,pre_end,in,i+1,in_end);
                break;
            }
        }
        return root;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0){
            return null;
        }
        //�����ϣ������½����飬����ǰ�����������У����Ǿ���Ҫ���Ѷ���ռ�
        //���ԣ����ǲ�ȡ��ԭ�����ڽ��в���
        //ʹ�ñ������޶����鷶Χ
        return reConstructBinaryTreeCore(pre,0,pre.length-1,in,0,in.length-1);
    }
}