输入一个字符串，打印出该字符串中字符的所有排列。

 

你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。

 

示例:

输入：s = "abc"
输出：["abc","acb","bac","bca","cab","cba"]
 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


class Solution {
    public String[] permutation(String s) {
        Set<String> list = new HashSet<>();
        char[] arr = s.toCharArray();
        boolean[] visited = new boolean[arr.length];
        dts(arr,"",visited,list);
        return list.toArray(new String[0]);
    }
    private void dts(char[] arr, String s, boolean[] visited, Set<String> list) {
        if(s.length() == arr.length) {
            list.add(s);
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            if(visited[i]) {
                continue;
            }
            visited[i] = true;
            dts(arr, s + String.valueOf(arr[i]), visited, list);
            visited[i] = false;
        }
    }
}