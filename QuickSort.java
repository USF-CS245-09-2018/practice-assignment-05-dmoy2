public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        quickSort(a, 0, a.length-1);

    }

    public void quickSort(int[]a, int low, int high) {
        if(low >= high){
            return;
        }
        int pivot = a[(low+high)/2];
        int partition = partition(a, low, high,pivot);
        quickSort(a, low, partition-1);
        quickSort(a, partition,high);
    }

    public int partition(int[] a, int low, int high, int pivot){
        while (low <= high) {
            while (a[low] < pivot) {
                low++;
            }
            while (a[high] > pivot) {
                high--;
            }
            if (low <= high) {
                swap(a, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    public void swap(int[] a, int low, int high){
        int temp = a[low];
        a[low] = a[high];
        a[high] = temp;
    }
}
