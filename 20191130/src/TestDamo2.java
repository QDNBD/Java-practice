import java.lang.reflect.Array;
import java.util.Arrays;

public class TestDamo2 {


    public static void reverse(char[] array,int left,int right) {
        while (left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static String reverseSentence(String str) {
        char[] array = str.toCharArray();
        reverse(array,0,array.length-1);
        int i = 0;
        int j = 0;
        //单词逆置
        while (i < array.length) {
            if(array[i] == ' '){
                i++;
                j++;
            }else if ( i == array.length || array[i] == ' ' ) {
                reverse(array,j,i-1);
                ++i;
                j = i;
            }else {
                i++;
            }
        }
        return String.copyValueOf(array);
    }

    public static void main(String[] args) {
        String ret = reverseSentence("i am student      ");
        System.out.println(ret);
    }


    public static void main2(String[] args) {
        String srt = "aabbccdee";
        char[] array = srt.toCharArray();
        int i = 0;

    }


    public static int[] compear(int[] array1,int[] array2){
        int i = 0;
        int j = 0;
        int count = 0;
        int[] array = new int[array1.length + array2.length];

       while (i < array1.length && j < array2.length){
            if (array1[i] <= array2[j]) {
                array[count++] = array1[i++];
            }else {
                array[count++] = array2[j++];
            }
        }
        while (i < array1.length) {
            array[count++] = array1[i++];
        }
        while (j < array2.length){
           array[count++] = array2[j++];
        }
        return array;
    }

    public static void main1(String[] args) {
        int[] array1 = {1,3,6,9};
        int[] array2 = {2,4,6,8};
        int[] array = compear(array1,array2);
        System.out.println(Arrays.toString(array));

    }
}
