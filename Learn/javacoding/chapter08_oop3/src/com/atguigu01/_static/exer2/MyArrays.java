package com.atguigu01._static.exer2;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._static.exer2.MyArrays
 * @Date: 2024年01月03日 17:48
 * @Description:
 */
public class MyArrays {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static int binarySearch(int[] arr, int dest) {
        int head = 0; //初始的首索引
        int end = arr.length - 1; //初始的末索引

        while (head <= end) {
            int middle = (head + end) / 2;
            if (dest == arr[middle]) {
                return middle;
            } else if (dest < arr[middle]) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }
        return -1;
    }

    /**
     * @param arr 要获取最大值的数组
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            //如果当前元素比max大，则替换max
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    /**
     * @param arr 要获取最小值的数组
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            //如果当前元素比min小，则替换min
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        return arr1;
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            //交换
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
    }

    public static void getAvg(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("平均值为：" + sum / arr.length);
    }
}