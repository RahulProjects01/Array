import java.util.*;

public class RemoveDuplicateElement {
    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0)
                System.out.print(a[i] + " ");
        }
    }

    static void sort(int a[]) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void duplecate(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                }
            }
        }
    }

    static void even(int a[]) {
        int ab = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    ab = a[i];
                }
            }
        }

    }

    static void even1(int a[]) {
        int ab = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    ab = a[i];
                }
            }
        }
        print(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr array size: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        print(a);
        System.out.println();
        sort(a);
        System.out.println();
        print(a);
        System.out.println();
        duplecate(a);
        System.out.println();
        even(a);
        System.out.println("output: ");
        even1(a);

    }
}
