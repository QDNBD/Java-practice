import java.util.*;
public class Solution {
    public void printListFromTailToHeadCore(ArrayList<Integer> list,ListNode listNode) {
        if(listNode == null){
            return;
        } 
        printListFromTailToHeadCore(list, listNode.next);
        list.add(listNode.val);
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        printListFromTailToHeadCore(list, listNode);
        return list;
//         ArrayList<Integer> array = new ArrayList<>();
//         Stack<Integer> ant = new Stack<>();
//         while(listNode != null) {
//             ant.push(listNode.val);
//             listNode = listNode.next;
//         }
//         while(!ant.isEmpty()) {
//             array.add(ant.pop());
//         }
//         return array;
        
    }
}