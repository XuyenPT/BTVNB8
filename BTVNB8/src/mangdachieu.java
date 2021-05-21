import java.util.Scanner;
public class mangdachieu {
    static void bai1 () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap bac cua mang A: ");
        int n = scan.nextInt();
        System.out.println("Cac phan tu cua mang A: ");
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scan.nextInt();
            }
        }
        System.out.println("Mang A gom: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("");
        }

        int sum = 0;
        System.out.println("Cac phan tu tren duong cheo chinh: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(A[i][j] + "\t");
                    sum = sum + A[i][j];
                }
            }
        }
        System.out.println("\n Tong cac phan tu tren duong cheo chinh: " + sum);

        int[] B = new int[n];
        System.out.println("Cac phan tu o hang 2: ");
        for (int j = 0; j < n; j++) {
                B[j] = A[1][j];
                System.out.print(B[j] + "\t");
                }

        int tg;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                    if (B[i] > B[j]) {
                        tg = B[i];
                        B[i] = B[j];
                        B[j] = tg;
                    }
                }
            }
            System.out.println("\n Hang 2 da sap xep la:");
            for (int i = 0; i < n; i++) {
                System.out.print(B[i] + "\t");
            }

        }
    }


