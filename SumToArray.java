
public class SumToArray {
    public static void main(String[] args) {
        int a[] = { 12, 21, 13, 22, 33 };
        int b[] = { 12, 121, 33, 22, 11 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }
}
