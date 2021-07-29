class Solution {
    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int num : nums) {
            list.add(String.valueOf(num));
        }
        list.sort((o1,o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder res = new StringBuilder();
        for(String s : list) {
            res.append(s);
        }
        return res.toString();
       // return String.join("",list);
    }
}