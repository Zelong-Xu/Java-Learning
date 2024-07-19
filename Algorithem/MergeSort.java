public class MergeSort {
    public int sortArray(int[] nums){

    }

    private void merge(int[] arr, int l, int m, int r){
        int nl = m - l + 1;
        int nr = r - m;

        int[] Left = new int[];
        int[] Right = new int[];

        for(int i= 0; i<nl; i++){
            Left[i] = arr[l+i];
        }

        for(int j= 0; j<nr; j++){
            Right[j] = arr[m+1+j];
        }
    }

    public void mergeSort(int[] arr, int l, int r){
        if(l < r){
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
}
