
import java.util.*;

public class ToPointerSorting {

    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void ToPointer(int a[]) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            if (a[left] > a[right]) {
                swap(a, left, right);
            }
            left++; 
            right--;
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 0, 1, 0, 1, 0 };
        printArray(a);
        ToPointer(a);
        printArray(a);
    }

}