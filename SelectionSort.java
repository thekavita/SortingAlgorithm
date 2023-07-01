public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {64,25,12,11,22};

        int min_idx;

        for(int i = 0; i < arr.length-1;i++){
            min_idx = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
