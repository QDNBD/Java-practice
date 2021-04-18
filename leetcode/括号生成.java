class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        getParenthesis(res,"",0,0,n);
        return res;
    }
    private void getParenthesis(List<String> res,String ans,int leftSum,int rightSum,int n) {
        if(leftSum > n || rightSum > n) {
            return ;
        }
        if(leftSum == n && rightSum == n) {
            res.add(ans);
        }
        if(leftSum >= rightSum) {

            getParenthesis(res,ans + "(",leftSum + 1,rightSum,n);
            getParenthesis(res,ans + ")",leftSum,rightSum + 1,n);
        }
    }
}