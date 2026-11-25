import java.util.Arrays;

public class SortingAlgorithms {

    // 1. Bubble Sort method
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 2. Selection Sort method
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 3. Insertion Sort method
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Helper method to display array elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array with 12 unsorted numbers (at least 10)
        int[] originalArray = {64, 25, 14, 92, 11, 90, 35, 43, 8, 77, 3, 50};

        System.out.print("Original Array: ");
        printArray(originalArray);

        // Separate copies so each algorithm sorts the original unsorted data
        int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] selectionArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] insertionArray = Arrays.copyOf(originalArray, originalArray.length);

        bubbleSort(bubbleArray);
        System.out.print("Sorted Array using Bubble Sort: ");
        printArray(bubbleArray);

        selectionSort(selectionArray);
        System.out.print("Sorted Array using Selection Sort: ");
        printArray(selectionArray);

        insertionSort(insertionArray);
        System.out.print("Sorted Array using Insertion Sort: ");
        printArray(insertionArray);
    }
}
