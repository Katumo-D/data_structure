package selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArr={2,5,4,7,8,1,5};
        selectionsort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
}
