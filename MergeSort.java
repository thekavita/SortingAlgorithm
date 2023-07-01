public class MergeSort {
    public static void main(String[] args) {
        int[]arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        mergeSort(arr , 0 , n-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int[]arr , int left , int right){
     if(left < right){
         int mid = left + (right - left)/2;

         mergeSort(arr , left , mid);
         mergeSort(arr , mid+1 , right);
         merge(arr , left , mid , right);
     }
    }
    public static void merge(int[]arr , int l , int mid , int r){
        int n1 = mid - l+1;
        int n2 = r-mid;

        int[]L = new int[n1];
        int[]R = new int[n2];

        for(int i = 0; i < n1; i++) L[i] = arr[l+i];
        for(int i = 0; i < n2; i++) R[i] = arr[mid+i+1];

        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k++] = L[i++];
            }
            else{
                arr[k++] = R[j++];
            }
        }

        while(i < n1){
            arr[k++] = L[i++];
        }
        while(j < n2){
            arr[k++] = R[j++];
        }
    }
}
