public class CheckArraySorting {

    static boolean print(int a[]) {
        boolean check = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int a[] = { 5, 3, 2, 4, 1 };
        System.out.println(print(a));
    }
}
