import java.util.*;

class Threejagged {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a[][][] = new int[2][][];
        a[0] = new int[3][];
        a[1] = new int[2][];
        a[0][0] = new int[2];
        a[0][1] = new int[3];
        a[0][2] = new int[4];
        a[1][0] = new int[2];
        a[1][1] = new int[4];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the details of the School " + (i + 1) + " :");
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Enter the Class " + (j + 1) + " :");
                for (int k = 0; k < a[i][j].length;  k++) {
                    System.out.print("Enter the Student " + (k + 1) + " : ");
                    a[i][j][k] = my.nextInt();
                }
                my.close();
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                
                System.out.println();
            }
            System.out.println();
        }
    }
}