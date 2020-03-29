import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2,3,4,5,6));
    }
    public static int sum(int... array) {
        int ret = 0;
        for (int x:array) {
            ret += x;
        }
        return ret;
    }




    public static void main5(String[] args) {
        int[] array = {1,2,3};
        func(array);
        System.out.println(array[0]);
    }
    public static void func(int[] arr) {
        arr[0] = 99;
        System.out.println(arr[0]);
    }

    public static void printArray(int[] arr) {
        for (int x:arr) {
            System.out.println(x);
        }
    }


    public static void main3(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = Arrays.copyOf(arr, arr.length);
        max(newArr,arr.length);
        min(newArr,arr.length);
        ave(newArr,arr.length);
        fan(newArr,arr.length);
        bubbleSort(newArr,arr.length);
        System.out.println("二分查找:" + binarySearch(newArr,5,arr.length));
        transform(newArr);
    }

    public static void max(int[] array,int se) {
        int tem = array[0];
        for (int i = 0; i <se ; i++) {
            if(array[i] > tem) {
                tem = array[i];
            }
        }
        System.out.println("max:" + tem);
    }

    public static void min(int[] array,int se) {
        int tem = array[0];
        for (int i = 0; i <se ; i++) {
            if(array[i] < tem) {
                tem = array[i];
            }
        }
        System.out.println("min:" + tem);
    }

    public static void ave(int[] array,int se) {
        double tem = 0.0;
        for (int i = 0; i <se ; i++) {
            tem += array[i];
        } tem = tem / (double)se;
        System.out.println("ave:" + tem);
    }

    public static void fan(int[] array,int se) {
        int[] ret = new int[se];
        for (int i = 0; i <se ; i++) {
            ret[i] = array[se - 1 - i];
        }
        System.out.println("逆置:" + Arrays.toString(ret));

    }

    public static void bubbleSort(int[] array,int se) {
        int[] ret = Arrays.copyOf(array, se);
        for (int i = 0; i < se ; i++) {
            boolean flat = true;
            for (int j = 0; j < se - i - 1; j++) {
                if(ret[j] > ret[j+1]) {
                    int max = ret[j];
                    ret[j] = ret[j+1];
                    ret[j+1] = max;
                    flat = false;
                }
            }if (flat){
                break;
            }
        }System.out.println("冒泡排序" + Arrays.toString(ret));

    }

    public static int binarySearch(int[] array,int key,int right) {
        int left = 0;
        if(left > right) {
            return -1;
        }
        int mid = (left+right) >>> 1;
        if(array[mid] == key) {
            return mid;
        }else if (array[mid] < key) {
            return binarySearch(array,key,left = mid+1);
        }else {
            return binarySearch(array,key,right = mid-1);
        }
    }

    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
// 该循环结束, left 就指向了一个奇数
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
// 该循环结束, right 就指向了一个偶数
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
// 交换两个位置的元素
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
        System.out.println("偶数排放在奇数前" + Arrays.toString(arr));
    }












    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(toString(arr));
    }
    public static String toString(int[] array) {
        String arr1 = "[";
        for (int i = 0; i <array.length ; i++) {
            arr1 += array[i];
            if(i != array.length - 1) {
                arr1 += ",";
            }
        }arr1 += "]";
        return arr1;
    }

    public static int[] transform1(int[] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i] * 2;
        }
        return array1;
    }


    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = transform1(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(ret[i] + " ");
        }
        System.out.print(Arrays.toString(array));
    }
}
