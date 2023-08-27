import java.util.*;
public class SecondLargestNum {
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void sort(int a[], int temp) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
        printArray(a);
    }

    static void duplicate(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                }
            }
        }
        printArray(a);
    }

    static void max(int a[]) {
        int max = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("second Largest value is: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aary size: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println();
        duplicate(a);
        System.out.println();
        sort(a, 0);
        System.out.println();
        max(a);
    }
}
