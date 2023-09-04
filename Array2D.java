
public class Array2D{
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int b[][] = {{1,2,3},{1,2,3},{1,2,3}};
        // int sum[][] ={{0,0,0},{0,0,0},{0,0,0}};
        int sum[][] = new int[3][3];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
               sum[i][j] = a[i][j] + b[i][j];
               System.out.print(sum[i][j]+" ");
            }
        } 
        System.out.println();
    }
}