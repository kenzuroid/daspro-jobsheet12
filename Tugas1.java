import java.util.Scanner;
public class Tugas1 {

    static void cetakRekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " ");
        cetakRekursif(n - 1); 
    }

    static void cetakIteratif(int n){
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
         }
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        System.out.println("\nDeret Rekursi dari bilangan " + n + " adalah: ");
        cetakRekursif(n);

        System.out.println("\nDeret Iteratif dari bilangan " + n + " adalah: ");
        cetakIteratif(n);
    }
}