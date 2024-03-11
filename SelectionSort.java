// find the minimum from the unsorted part and swap. one by one. this is selection sort.
// Select minimum and swap with current index.

public class SelectionSort {
    public int[] sort(int[] array){
        for(int i=0; i<array.length; i++){
            int min = array[i];
            int minIndex = i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<min){
                    min = array[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[i];
                array[i] = min;
                array[minIndex] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[] array = {3, 10, 6, 18, 15, 4, 7, 12};
        SelectionSort selectionSort = new SelectionSort();
        int[] newArray = selectionSort.sort(array);
        for(int i : newArray){
            System.out.println(i);
        }
    }
}
