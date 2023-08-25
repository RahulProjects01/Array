
import java.util.*;

public class DeffrentElement {
    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void unique(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                    a[j] = -1;

                }
            }
        }
        int ab = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                ab = a[i];
                System.out.println("the uniqe element is " + ab);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 1, 2, 3, 6 };
        System.out.println("orignal array");
        print(a);
        System.out.println("unique element: ");
        unique(a);
    }
}

