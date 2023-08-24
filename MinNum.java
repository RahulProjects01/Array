public class MinNum {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 8, 6, 5, 4, 3, 9 };
        int min = a[0]; // ishko hame 0 se start nhi karna hai!
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                a[i] = min;
            }
        }
        System.out.println("minimam number is: " + min);
    }
} 
