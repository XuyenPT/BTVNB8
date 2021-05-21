import java.util.Scanner;
public class mangmotchieu {
    static void nguyento(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        System.out.println("Nhap phan tu cho mang: ");
        int []A = new int[n];
        for (int i = 0; i< n; i++){
            System.out.print("A["+i+"]: ");
            A[i] = scan.nextInt();
        }
        System.out.println("\n Mang A gom: ");
        for (int i = 0; i< n; i++){
            System.out.print (A[i]+ "\t");
        }
        int sum = 0;
        System.out.println("\n Cac so nguyen to cua mang: ");
        for (int i = 0; i< n; i++){
            if (ktnguyento(A[i])){
                System.out.print (A[i]+ "\t");
                sum = sum + A[i];
            }
        }
        System.out.println("\n Tong cac so nguyen to: "+sum);

    }
    static boolean ktnguyento (int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(number); i++){
            if (number % i ==0) {
                return false;
            }
        }
        return true;
    }
}
