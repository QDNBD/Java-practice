import java.util.*;
/*
public class ListNode {
int val;
ListNode next = null;
ListNode(int val) {
this.val = val;
}
}*/
public class Partition {
public ListNode partition(ListNode pHead, int x) {
ListNode ba = new ListNode(-1);
ListNode bs = ba;
ListNode ga = new ListNode(-1);
ListNode gs = ga;
ListNode cur = pHead;
while(cur != null) {
if(cur.val < x) {
bs.next = new ListNode(cur.val);
bs = bs.next;
}else {
gs.next = new ListNode(cur.val);
gs = gs.next;
} c
ur = cur.next;
} if
(ba.next == null) {
return pHead = ga.next;
} b
s.next = ga.next;
return pHead = ba.next;
}点此或手机扫描二维码查看代码编写过程
}