import java.util.Arrays;

public class TestDamo {

    public static void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = 0 ;
            for (j = i-1; j >= 0 ; j--) {
                if (array[j] > tmp) {
                    array[j+1] = array[j];
                }else  {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    /**
     * 希尔排序
     * 时间复杂度：O（n^1.3—n^1.5)
     * 空间复杂度O（1）；
     * 不稳定
     * @param array
     */
    public static void shellSort(int[] array ) {

    }

    /**
     * 选择排序
     *
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    //归并排序  递归   非递归
    //时间复杂度：n*log2n
    //空间复杂度：
    //
    public static void mergeSortInternal(int[] array,int low,int high) {
        if (low >= high) {
            return;
        }
            int mid = (low + high) / 2;
            mergeSortInternal(array, low, mid);
            mergeSortInternal(array, mid + 1, high);
            //合并
            merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {

        int s1 = low;
        int s2 = mid + 1;
        int[] tmpArr = new int[high-low+1];
        int i =0;//tmpArr 的下标
        //两个归并段都有数据
        while(s1 <= mid && s2 <= high) {
            if(array[s1] <= array[s2]) {
                tmpArr[i++] = array[s1++];
            }else {
                tmpArr[i++] = array[s2++];
            }
        }
        while (s1 <= mid){
            tmpArr[i++] = array[s1++];
        }
        while (s2 <= high) {
            tmpArr[i++] = array[s2++];
        }
        //temArr 里面存放的是有序数据放回到array
        for (int j = 0; j < tmpArr.length;j++) {
            array[low+j] = tmpArr[j];
        }
    }


    public static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }

    //非递归
    public static void mergeSort1(int[] array) {
        for (int i = 1; i < array.length; i *= 2) {
            merge1(array,i);
        }
    }

    private static void merge1(int[] array,int gap) {
        int[] temArr = new int[array.length];
        int k =0;

        int s1 = 0;
        int e1 = s1 + gap - 1;
        int s2 = e1 +1;
        int e2 = s2 + gap -1 < array.length ? s2+gap-1:array.length-1;
        //两个归并段都有数据
        while (s2 < array.length) {
            while (s1 <= e1 && s2 <= e2) {
                if (array[s1] <= array[s2]) {
                    temArr[k++] = array[s1++];
                }else {
                    temArr[k++] = array[s2++];
                }
            }
            while (s1 <= e1) {
                temArr[k++] = array[s1++];
            }
            while (s2 <= e2) {
                temArr[k++] = array[s2++];
            }
            s1 = e2 + 1;
            e1 = s1 + gap - 1;
            s2 = e1 + 1;
            e2 = s2 + gap -1 < array.length ? s2+gap-1:array.length-1;
        }
        //判断是否还有一个段有数据，并且一定是s1 哪个段，e1可能会越界
        while (s1 <= array.length-1) {
            temArr[k++] = array[s1++];
        }
        for (int i = 0; i < temArr.length ; i++) {
            array[i] = temArr[i];
        }
    }


    public static void main(String[] args) {
        int[] array = {23,45,3,4,2,65,43,67,88,75,44};
        System.out.println(Arrays.toString(array));
        mergeSort1(array);
        System.out.println(Arrays.toString(array));
    }


    public static int partion(int[] array,int start,int end) {
        int tmp = array[start];
        while (start < end) {
            while (start < end && array[end] >= tmp) {
                end--;
            }
            if (start >= end) {
                array[start] = tmp ;
                break;
            }else  {
                array[start] = array[end];
            }
            while (start < end && array[start] <= tmp) {
                start++;
            }
            if (start >= end) {
                array[start] = tmp ;
                break;
            }else  {
                array[end] = array[start];
            }
        }
        array[start] = tmp;
        return start;
    }








}
