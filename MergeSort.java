import java.util.*;

public class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        if(a.length > 1){
            int[] left = leftArr(a);
            int[] right = rightArr(a);

            sort(left);
            sort(right);
            merge(a, left, right);
        }
    }

    public int[] leftArr(int[] a) {
        return Arrays.copyOfRange(a, 0, a.length/2);
    }

    public int[] rightArr(int[] a) {
        return Arrays.copyOfRange(a, a.length/2, a.length);
    }

    public void merge(int[] a, int[] left, int[] right){
        int i = 0;  // left
        int j = 0;  // right
        int index = 0;

        while(i < left.length || j < right.length){
            if(i >= left.length){
                a[index++] = right[j++];
            }
            else if (j >= right.length){
                a[index++] = left[i++];
            }
            else{
                if (left[i] < right[j]){
                    a[index++] = left[i++];
                }
                else if (left[i] > right[j]){
                    a[index++] = right[j++];
                }
                else{
                    a[index++] = left[i++];
                }
            }

        }
    }

}
