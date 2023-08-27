public class Prefix {
    static void print(int a[]) {
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int[] prefix(int a[]) {
        int n = a.length;
        int prefix[] = new int[n];
        prefix[0] = a[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        int a[] = { 2, 1, 3, 4, 5 };
        print(a);
        int[] prefixsum = prefix(a);
        System.out.println();
        print(prefixsum);

    }
}