package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        // implement here
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > temp; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = temp;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        boolean isSorted = false;
        for(int i = 1; i<list.length && !isSorted; i++){
            isSorted = true;
            for(int j=0; j<list.length-i; j++){
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j+1] = temp;
                    isSorted = false;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
/*
    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        if(list.length>1) {
            int midpoint = list.length / 2;
            int[] leftHalf = new int[midpoint];
            System.arraycopy(list, 0, leftHalf, 0, midpoint);
            mergeSort(leftHalf);

            int rightHalfLength = list.length - midpoint;
            int[] rightHalf = new int[rightHalfLength];
            System.arraycopy(list, midpoint, rightHalf, 0, rightHalfLength);
            mergeSort(rightHalf);
            combine(leftHalf, rightHalf, list);
        }
final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime
        return list;
    }
*/
/*
    public int[] quickSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        // implement here
        quickSort(list, 0, list.length - 1);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    */
    
    public int [] heapSort(int [] array){
        int [] list = array;
        final long startTime = System.currentTimeMillis();
        //implement here

        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> bucket = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            bucket.add(new ArrayList<>());
        }
        for (int value : list) {
            int key = hash(value);
            bucket.get(key).add(value);
        }
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i) != null) {
                Collections.sort(bucket.get(i));
                list1.addAll(bucket.get(i));
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int hash(int value) {
        return value / 10;
    }

    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        // implement here
        for (int space = list.length / 2; space > 0; space /= 2) {
            for (int i = space; i < list.length; i++) {
                int key = list[i];
                int k = i;
                while (k >= space && list[k - space] > key) {
                    list[k] = list[k - space];
                    k -= space;
                }
                list[k] = key;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
