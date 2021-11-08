import java.util.ArrayList;
import java.util.Scanner;

public class BinomialCoefficient {

     public static void main(String[] args) {

          // 1
          // 1 1
          // 1 2 1
          // 1 3 3 1
          // 1 4 6 4 1
          // 1 5 10 10 5 1

          // int n = 5;
          // int k = 2; // 5C2
          // int res = 1;
          // for (int i = 0; i < k; i++) {
          // res *= (n - i);
          // res /= (i + 1);
          // }
          // System.out.print(res + " ");

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Size of triangle:");
          int n = sc.nextInt();
          ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(5);
          ArrayList<Integer> row, pre = null;

          for (int i = 0; i < n; i++) {
               // al.add(new ArrayList<Integer>());
               row = new ArrayList<>();
               for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i)
                         row.add(1);
                    else
                         row.add(pre.get(j - 1) + pre.get(j));
               }
               pre = row;
               al.add(row);
          }
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < al.get(i).size(); j++) {
                    System.out.print(al.get(i).get(j));
               }
               System.out.println();
          }

     }
}