
public class QuickSortAlgorithm {
    public static void main(String[] args) {
        int[]arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
       quicksort(arr , 0 , n-1);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

    }

   public static void quicksort(int[]arr,int low , int high) {
     if(low < high){
         int pi = Partition(arr , low , high);

         quicksort(arr , low ,pi-1);
         quicksort(arr ,pi+1 ,high);
     }

   }
   public static int Partition(int[]arr, int low ,int high){
        int i = low - 1;
        int pivot = arr[high];

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
   }
}
