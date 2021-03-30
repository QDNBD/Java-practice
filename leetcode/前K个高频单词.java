给一非空的单词列表，返回前 k 个出现次数最多的单词。

返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。

示例 1：

输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
输出: ["i", "love"]
解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
    注意，按字母顺序 "i" 在 "love" 之前。
 

示例 2：

输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
输出: ["the", "is", "sunny", "day"]
解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
    出现次数依次为 4, 3, 2 和 1 次。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/top-k-frequent-words
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。




class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       Map<String, Integer> map = new HashMap<>(words.length);
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        //大堆
        PriorityQueue<String> queue = new PriorityQueue<>((o1, o2) -> {
            Integer o1Count = map.get(o1);
            Integer o2Count = map.get(o2);
            if (o1Count.equals(o2Count)) {
                return o1.compareTo(o2);
            } else {
                return o2Count - o1Count;
            }
        });
        for(String s:map.keySet()){
            queue.add(s);
        }
        List<String> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(queue.poll()); 
        }
        return res;
    }
}


class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String s : words){
            if(map.get(s) == null){
                map.put(s,1);
            }else {
                map.put(s,map.get(s) + 1);
            }
        }
        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>
                (k, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //在调整的时候，如果频率相同。
                if(o1.getValue().equals(o2.getValue())) {
                    //o2 > o1调整
                    return o2.getKey().compareTo(o1.getKey());
                    // return o1.getKey().compareTo(o2.getKey());//
                }
                //j-1->o1     j->o2    [j-1] > [j]  交换-》调整
                return o1.getValue().compareTo(o2.getValue());//按照频率升序
            }
        });

        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if(minHeap.size() < k) {
                minHeap.add(entry);
            }else{
               Map.Entry<String,Integer> top = minHeap.peek();
                //频率相同
                if(top!=null && top.getValue().equals(entry.getValue())) {
                    //字母小的入  bcdef         abcd
                    if(top.getKey().compareTo(entry.getKey()) > 0) {
                        minHeap.poll();
                        minHeap.add(entry);
                    }
                }else {
                    if(top != null && top.getValue() < entry.getValue()) {
                        minHeap.poll();
                        minHeap.add(entry);
                    }
                }
            }
        }

        System.out.println(minHeap);// love  i
        List<String> list = new ArrayList<>();
        for(int i = 0;i < k;i++) {
            String pop = minHeap.peek().getKey();
            list.add(0,pop);
            minHeap.poll();
        }
        return list;
        


    }
}