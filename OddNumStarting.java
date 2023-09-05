
// Q.->
// Swap number explain with pointers : 

// given an array of integer 'a' move all the even integers at the begining of the array followed by all the odd integers the relative order of odd or even integers does not matter return any array that satisfies the conditon.
// 1 2 3  4 5 
// 1 3 5 2 4 

public class OddNumStarting {
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
    }

    static void Swap(int a[], int i, int j) 
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void Even(int[] a) 
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] % 2 == 0) {
                    Swap(a, i, j);
                }
            }
        }
    }

    static void Even1(int[] a) 
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] % 2 == 0) {
                    Swap(a, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 10, 5, 3, 6, 8, 9, 2 };
        printArray(a);
        System.out.println();
        sort(a);
        Even(a);
        Even1(a);
        printArray(a);
    }
}
