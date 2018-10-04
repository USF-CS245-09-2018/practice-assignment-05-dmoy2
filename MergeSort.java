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
        int size = a.length / 2;
        int[] left = new int[size];
        for (int i = 0; i < size; i++) {
            left[i] = a[i];
        }
        return left;
    }

    public int[] rightArr(int[] a) {
        int size = a.length / 2;
        int[] right = new int[size];
        for (int i = 0; i < size; i++) {
            right[i] = a[size+i];
        }
        return right;
    }

    public void merge(int[] a, int[] left, int[] right){
        int i = 0;  // left
        int j = 0;  // right
        int index = 0;

        while(i < left.length && j < right.length){
            if (left[i] < right[j]){
                a[index++] = left[i++];
            }
            else{
                a[index++] = right[j++];
            }
        }
        while(i < left.length){
            a[index++] = left[i++];
        }
        while(j< right.length){
            a[index++] = right[j++];
        }

    }

}
