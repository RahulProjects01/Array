
import java.util.*;
public class SprialMetricks2D{
    static void printArray(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
            System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
       
    }
    static int[][] spiral(int n)
    {
        int [][]a=new int[n][n];
        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;
        int current=1;
        while(current < n*n){
            //top row--->left column to right column 
            for(int j=leftCol;j<=rightCol&& current<=n*n;j++)
            {
                a[topRow][j]=current;
                current++;
            }
            topRow++;
            //right column -->topRow to bottomRow
            for(int i=topRow;i<=bottomRow && current<=n*n ;i++)
            {
               a[i][rightCol]=current++;
            }
            rightCol--;
            //bottomRow -->right to leftcolumn 
            for(int j=rightCol;j>=leftCol && current<=n*n;j--)
            {
                a[bottomRow][j]=current++;
            }
            bottomRow--;
            //leftcol -->bottomRow to topRow 
            for(int i=bottomRow;i>=topRow && current<=n*n;i--)
            {
                a[i][leftCol]=current++;
            }
            leftCol++;
        }
        return a;
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of n ");
       int n=sc.nextInt();
       int [][]arr=spiral(n);
       printArray(arr);
    }
}


