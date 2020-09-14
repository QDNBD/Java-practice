import java.util.*;

public class textDamo {
    public static String AddLonglnteger(String addend,String augend){
        if(addend == null){
            return augend;
        }
        if(augend == null){
            return addend;
        }
        Stack<Character> adden = new Stack<>();
        Stack<Character> augen = new Stack<>();
        Stack<Integer> ant = new Stack<>();
        for(int i = 0 ; i < addend.length(); i++){
            adden.add(addend.charAt(i));
        }
        for(int i = 0 ; i < augend.length(); i++){
            augen.add(augend.charAt(i));
        }
        int count = 0;
        while(adden.size()>1 && augen.size()>1){

            //((adden.pop()-'0') + (augen.pop() - '0'))
                count = ( count + (adden.pop()-'0') + (augen.pop() - '0')) / 10;
                ant.add((adden.pop() - '0') + (augen.pop() - '0') - count * 10);
        }
        int sum = 0;
        while(augen.size() >= 1) {
            sum = (augen.pop() - '0' + count)/10;
            ant.add((augen.pop() - '0'+ count) - sum*10);
        }
        while(adden.size() >= 1) {
            sum = (adden.pop() - '0' + count)/10;
            ant.add((adden.pop() - '0'+ count) - sum*10);
        }
        if (sum > 0){
            ant.add(sum);
        }
        int[] ret = new int[ant.size()];
        for(int i = 0 ; i < ant.size(); i++){
            ret[i] = ant.pop();
        }
        String retu = ret.toString();
        return retu;

    }


    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.println(AddLonglnteger(a,b).toString());

    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> ant = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < arr[i]; j++) {
                ant.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        int len = ant.size();
        for(int i = 0;i < len;i++) {
            if(ant.peek() == 0){
                temp.add(ant.pop());
            }else {
                sb.append(ant.pop());
                break;
            }
        }
        while (!temp.isEmpty()){
            sb.append(temp.pop());
        }
        while (!ant.isEmpty()){
            sb.append(ant.pop());
        }
        System.out.println(sb.toString());
    }


    public static void getString(int n){
        if(n < 1) {
            System.out.printf("-" + 1);
            return;
        }
        int leftNum = n*(n-1)+1;

        StringBuilder str = new StringBuilder();
        for(int i = 0; i < n;i++){
            if(i == n-1){
                str.append(leftNum);
            }else{
                str.append(leftNum);
                str.append("+");
            }
            leftNum += 2;
        }
        System.out.printf(str.toString());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        getString(n);
    }
}
