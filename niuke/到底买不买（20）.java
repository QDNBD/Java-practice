import java.util.*;
public class Main {
    public static String isBuy (String hasNum,String needNum) {
        Map<Character,Integer> hasMap = new HashMap<>();
        char[] hasChar = hasNum.toCharArray();
        for(int i = 0; i < hasNum.length(); i++) {
            if(hasMap.containsKey(hasChar[i])) {
            int count = hasMap.get(hasChar[i]);
            hasMap.put(hasChar[i],count + 1);
            }else {
            hasMap.put(hasChar[i], 1);
            }
        }
        char[] needChar = needNum.toCharArray();
        int lastNum = 0;
        for(int i = 0; i < needNum.length();i++) {
            if(hasMap.containsKey(needChar[i])) {
                if(hasMap.get(needChar[i]) > 0) {
                    int count = hasMap.get(needChar[i]);
                    hasMap.put(needChar[i],count - 1);
                }else {
                    lastNum++;
                }
            }else {
                lastNum++;
            }
        }
        String ret = null;
        if(lastNum == 0) {
            ret = "Yes" + " " + (hasNum.length() - needNum.length());
        }else {
            ret = "No" + " " + (lastNum);
        } 
        return ret;
} 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
        String hasNum = scan.nextLine();
        String needNum = scan.nextLine();
        System.out.println(isBuy(hasNum,needNum));
        }
        scan.close();
    }
}