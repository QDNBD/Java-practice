import java.util.*;
public class Main {
    public static boolean isContins(String a,int lena,String b,int lenb) {
        if(lena < lenb) {
            return false;
        }
        char[] ach = a.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0;i < lena;i++) {
            list.add(ach[i]);
        }
        for(int i = 0;i < lenb;i++) {
            if(list.contains(b.charAt(i))) {
                list.remove(list.get(list.indexOf(b.charAt(i))));
            }else {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {// ע�⣬��������Ƕ��������������ͨ��whileѭ����������������
            String[] str = scan.nextLine().split(" ");
            String stra = str[0];
            String strb = str[1];
            
            System.out.println(isContins(stra,stra.length(),strb,strb.length()) == true? "Yes" : "No");
        }
        scan.close();
    }
}