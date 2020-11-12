import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public void Swap(char[] str,int i,int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    
    public boolean IsExist(char[] str,ArrayList<String> result) {
        return result.contains(String.valueOf(str));
    }
    
    public void PermutationHepler(char[] str,int star,ArrayList<String> result) {
        if(star == str.length - 1) {
            if(!IsExist(str,result)) {
                result.add(new String(str));
            }
            return;
        }
        for(int i = star;i < str.length;i++) {
            Swap(str,star,i);
            PermutationHepler(str,star+1,result);
            Swap(str,star,i);
        }
    }
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> result = new ArrayList<>();
        if(str.length() > 0 && str != null) {
            PermutationHepler(str.toCharArray(),0,result);
            Collections.sort(result);
        }
        return result;
    }
}